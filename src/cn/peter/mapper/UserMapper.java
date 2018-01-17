package cn.peter.mapper;


import java.util.List;
import java.util.Map;

import cn.peter.pojo.User;

public interface UserMapper {

	//select by user tag if
	List<User> selectByUserIf(User user);
	
	//select by user tag where
	List<User> selectByUserWhere(User user);
	
	//select by user tag choose when otherwise
	List<User> selectByUserChoose(User user);
	
	//select by user tag trim
	List<User> selectByUserTrim(User user);
	
	//select by user tag foreach
	List<User> selectByIdsForeach(Integer[] ids);
	
	//select by user tag foreach param user
	List<User> selectByIdsForeachUser(User user);
	
	//update user tag set
	Integer updateUserSet(User user);
	
	//update user tag trim
	Integer updateUserTrim(User user);
}
