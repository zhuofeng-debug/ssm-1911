package cn.zj.mybatis.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.zj.mybatis.mapper.UserMapper;
import cn.zj.mybatis.pojo.User;
import cn.zj.mybatis.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper mapper;
	
	@Override
	public int insert(User user) {
		
		return mapper.insert(user);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		
		
		return mapper.deleteByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKey(User user) {

		
		return mapper.updateByPrimaryKey(user);
	}

	@Override
	public User selectByPrimaryKey(Integer id) {
		
		
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public List<User> selectList() {
		
		
		return mapper.selectList();
	}

}
