package com.wj.sso.server.dao;

import com.wj.sso.common.tool.mybatis.Dao;
import com.wj.sso.server.model.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 管理员持久化接口
 * 
 * @author Joe
 */
public interface UserDao extends Dao<User, Integer> {
	
	public int enable(@Param("isEnable") Boolean isEnable, @Param("idList") List<Integer> idList);
	
	public int resetPassword(@Param("password") String password, @Param("idList") List<Integer> idList);

	public List<User> findPaginationByAccount(@Param("account") String account, @Param("appId") Integer appId);
	
	public User findByAccount(@Param("account") String account);
}
