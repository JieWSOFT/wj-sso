package com.wj.sso.common.tool.mybatis;


import java.io.Serializable;
import java.util.Collection;
import java.util.List;

/**
 * Dao接口
 * 
 * @author Joe
 */
public interface Dao<T, ID extends Serializable> {

	/**
	 * 查询所有分页
	 *
	 * @return
	 */
	public List<T> findByAll();
	
	/**
	 * 通过主键查询实体
	 * 
	 * @param pk
	 *            pk
	 * @return T
	 */
	public T get(ID pk);

	/**
	 * 插入实体
	 * 
	 * @param t
	 *            t
	 */
	public int insert(T t);

	/**
	 * 更新实体
	 * 
	 * @param t
	 *            t
	 */
	public int update(T t);
	
	/**
	 * 删除实体
	 * 
	 * @param idList
	 *            t
	 */
	public int deleteById(Collection<ID> idList);
}
