package cn.zj.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import cn.zj.mybatis.pojo.User;



public interface UserMapper {
	
	@Insert("insert into user (name,password,age)values(#{name},#{password},#{age})")
	int insert(User user);
	
	@Delete("delete from user where id = #{id}")
	int deleteByPrimaryKey(Integer id);
	
	@Update("update user set name = #{name},password = #{password},age = #{age} where id = #{id}")
	int updateByPrimaryKey(User user);
	
	@Select("select * from user Where id = #{id}")
	User selectByPrimaryKey(Integer id);
	
	@Select("select * from user")
	List<User> selectList();
	
}
