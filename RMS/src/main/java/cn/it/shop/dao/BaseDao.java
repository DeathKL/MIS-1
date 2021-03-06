package cn.it.shop.dao;

import java.util.List;


public interface BaseDao<T>{

	void save(T t);

	void update(T t);
	
	// 删除实体
	void delete(T t);
	//根据ID删除实体
	void delete(int id);	
	
	void delete(String username);
	
	// 仅仅查询当前对象, 不支持级联查询
	List<T> query();
	//根据ID加载实体
	T get(int id);
	List<T> query(int page, int rows);
	Long count();
	public int getAllRowCount(String hql);

}
