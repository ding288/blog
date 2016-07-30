package com.blog.dao.impl;

import java.util.List;
import java.util.Map;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import com.blog.dao.AbstractDao;

public abstract class AbstractDaoImpl<T> implements AbstractDao<T> {
	@Autowired
	private SessionFactory sessionFactory;

	public T get(Integer id) {
		return sessionFactory.openSession().get(getEntityClass(), id);
	}

	@SuppressWarnings("unchecked")
	public List<T> findAll() {
		Session session=sessionFactory.openSession();
		Query q=session.getNamedQuery(getEntityClass().getSimpleName() + ".findAll");
		return q.list();
	}

	@SuppressWarnings("unchecked")
	public List<T> findAll(int pageNum, int pageSize) {
		Session session=sessionFactory.openSession();
		Query q=session.getNamedQuery(getEntityClass().getSimpleName() + ".findAll");
		q.setFirstResult(pageNum).setMaxResults(pageSize);
		return q.list();
	}

	@SuppressWarnings("unchecked")
	public List<T> findByMap(String queryName, Map<String, Object> params) {
		Session session=sessionFactory.openSession();
		Query q=session.getNamedQuery(queryName);
		for (String param : params.keySet()) {
			q.setParameter(param, params.get(param));
		}
		return q.list();
	}

	@SuppressWarnings("unchecked")
	public List<T> findByMap(String queryName, Map<String, Object> params, int pageNum, int pageSize) {
		Session session=sessionFactory.openSession();
		Query q=session.getNamedQuery(queryName);
		for (String param : params.keySet()) {
			q.setParameter(param, params.get(param));
		}
		q.setFirstResult(pageNum * pageSize - pageSize);
		return q.list();
	}

	@SuppressWarnings("unchecked")
	public T findSingleResultByMap(String queryName, Map<String, Object> params) {
		Session session=sessionFactory.openSession();
		Query q=session.getNamedQuery(queryName);
		for (String param : params.keySet()) {
			q.setParameter(param, params.get(param));
		}
		return q.list().isEmpty() ? null : (T) q.list().get(0);
	}

	@SuppressWarnings("unchecked")
	@Override
	public T findSingleResultByOneParam(String queryName, String paramName, Object paramValue) {
		Session session=sessionFactory.openSession();
		Query q=session.getNamedQuery(queryName);
		q.setParameter(paramName, paramValue);
		List<T> l=q.list();
		return l.isEmpty() ? null : (T) l.get(0);
	}

	public Object findSingleValueByMap(String queryName, Map<String, Object> params) {
		Session session=sessionFactory.openSession();
		Query q=session.getNamedQuery(queryName);
		for (String param : params.keySet()) {
			q.setParameter(param, params.get(param));
		}
		return q.uniqueResult();
	}

	@SuppressWarnings("unchecked")
	public List<T> findByNativeQuery(String sql) {
		Session session=sessionFactory.openSession();
		SQLQuery q = session.createSQLQuery(sql);
		q.addEntity(getEntityClass());
		return q.list();
	}

	public void create(T entity) {
		Session session=sessionFactory.openSession();
		session.persist(entity);
	}

	public void update(Object entity) {
		Session session=sessionFactory.openSession();
		entity=session.merge(entity);
		session.persist(entity);
	}

	public void delete(T entity) {
		Session session=sessionFactory.openSession();
		session.delete(entity);
	}

	public abstract Class<T> getEntityClass();

}
