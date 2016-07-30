package com.blog.dao.impl;
//
//import java.util.List;
//import java.util.Map;
//import javax.persistence.TypedQuery;
//import org.hibernate.Session;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.orm.hibernate5.HibernateTemplate;

public abstract class AbstractDaoImpl2<T> {
//	@Autowired
//	private HibernateTemplate hibernateTemplate;
//
//	public T get(Integer id) {
//		return hibernateTemplate.get(getEntityClass(), id);
//	}
//
//	public List<T> findAll() {
//		Session session = hibernateTemplate.getSessionFactory().getCurrentSession();
//		TypedQuery<T> tq = session.createNamedQuery(getEntityClass().getSimpleName() + ".findAll", getEntityClass());
//		return tq.getResultList();
//	}
//
//	public List<T> findAll(int pageNum, int pageSize) {
//		Session session = hibernateTemplate.getSessionFactory().getCurrentSession();
//		TypedQuery<T> tq = session.createNamedQuery(getEntityClass().getSimpleName() + ".findAll", getEntityClass());
//		tq.setFirstResult(pageNum * pageSize - pageSize);
//		return tq.getResultList();
//	}
//
//	public List<T> findByMap(String queryName, Map<String, Object> params) {
//		Session session = hibernateTemplate.getSessionFactory().getCurrentSession();
//		TypedQuery<T> tq = session.createNamedQuery(queryName, getEntityClass());
//		for (String param : params.keySet()) {
//			tq.setParameter(param, params.get(param));
//		}
//		return tq.getResultList();
//	}
//
//	public List<T> findByMap(String queryName, Map<String, Object> params, int pageNum, int pageSize) {
//		Session session = hibernateTemplate.getSessionFactory().getCurrentSession();
//		TypedQuery<T> tq = session.createNamedQuery(queryName, getEntityClass());
//		for (String param : params.keySet()) {
//			tq.setParameter(param, params.get(param));
//		}
//		tq.setFirstResult(pageNum * pageSize - pageSize);
//		return tq.getResultList();
//	}
//
//	public T findSingleResultByMap(String queryName, Map<String, Object> params) {
//		Session session = hibernateTemplate.getSessionFactory().getCurrentSession();
//		TypedQuery<T> tq = session.createNamedQuery(queryName, getEntityClass());
//		for (String param : params.keySet()) {
//			tq.setParameter(param, params.get(param));
//		}
//		return tq.getSingleResult();
//	}
//
//	public Object findSingleValueByMap(String queryName, Map<String, Object> params) {
//		Session session = hibernateTemplate.getSessionFactory().getCurrentSession();
//		TypedQuery<?> tq = session.createNamedQuery(queryName, getEntityClass());
//		for (String param : params.keySet()) {
//			tq.setParameter(param, params.get(param));
//		}
//		return tq.getSingleResult();
//	}
//
//	public List<T> findByNativeQuery(String sql) {
//		Session session = hibernateTemplate.getSessionFactory().getCurrentSession();
//		NativeQuery<T> nq = session.createNativeQuery(sql, getEntityClass());
//		return nq.getResultList();
//	}
//
//	public List<?> findByNativeQuery(String sql, Class<?> resultClass) {
//		Session session = hibernateTemplate.getSessionFactory().getCurrentSession();
//		NativeQuery<?> nq = session.createNativeQuery(sql, resultClass);
//		return nq.getResultList();
//	}
//
//	public void create(T entity) {
//		hibernateTemplate.persist(entity);
//	}
//
//	public void update(T entity) {
//		entity = hibernateTemplate.merge(entity);
//		hibernateTemplate.persist(entity);
//	}
//
//	public void delete(T entity) {
//		hibernateTemplate.delete(entity);
//	}
//
//	public abstract Class<T> getEntityClass();

}
