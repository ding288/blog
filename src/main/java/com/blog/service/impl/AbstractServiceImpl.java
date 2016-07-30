package com.blog.service.impl;

import java.util.List;
import java.util.Map;

import com.blog.dao.AbstractDao;
import com.blog.service.AbstractService;

public abstract class AbstractServiceImpl<T> implements AbstractService<T> {

	@Override
	public T get(Integer id) {
		return getAbstractDao().get(id);
	}

	@Override
	public List<T> findAll() {
		return getAbstractDao().findAll();
	}

	@Override
	public List<T> findAll(int pageNum, int pageSize) {
		return getAbstractDao().findAll(pageNum, pageSize);
	}

	@Override
	public List<T> findByMap(String queryName, Map<String, Object> params) {
		return getAbstractDao().findByMap(queryName, params);
	}

	@Override
	public List<T> findByMap(String queryName, Map<String, Object> params, int pageNum, int pageSize) {
		return getAbstractDao().findByMap(queryName, params, pageNum, pageSize);
	}

	@Override
	public T findSingleResultByMap(String queryName, Map<String, Object> params) {
		return getAbstractDao().findSingleResultByMap(queryName, params);
	}

	@Override
	public Object findSingleValueByMap(String queryName, Map<String, Object> params) {
		return getAbstractDao().findSingleValueByMap(queryName, params);
	}

	@Override
	public List<T> findByNativeQuery(String sql) {
		return getAbstractDao().findByNativeQuery(sql);
	}

	@Override
	public void create(T entity) {
		getAbstractDao().create(entity);
	}

	@Override
	public void update(T entity) {
		getAbstractDao().update(entity);
	}

	@Override
	public void delete(T entity) {
		getAbstractDao().delete(entity);
	}

	public abstract AbstractDao<T> getAbstractDao();

}
