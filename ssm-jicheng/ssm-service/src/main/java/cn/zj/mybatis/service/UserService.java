package cn.zj.mybatis.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.zj.mybatis.pojo.User;

public interface UserService {
	int insert(User user);
	
	int deleteByPrimaryKey(Integer id);
	
	int updateByPrimaryKey(User user);
	
	
	User selectByPrimaryKey(Integer id);
	
	List<User> selectList();
	

}
