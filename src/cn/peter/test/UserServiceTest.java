package cn.peter.test;


import java.util.List;

import org.junit.Before;
import org.junit.Test;

import cn.peter.pojo.User;
import cn.peter.service.UserService;

public class UserServiceTest {
	UserService service = null;
	
	@Before
	public void init() {
		service = new UserService();
	}

	//test if
	@Test
	public void testSelectByUserIf() {
		User user = new User();
		//user.setId(4);
		//user.setUsername("Gaga");
		user.setPassword("666");
		List<User> list = service.selectByUserIf(user);
		System.out.println(list);
	}
	
	//test where
	@Test
	public void selectByUserWhere() {
		User user = new User();
		//user.setId(4);
		user.setUsername("Gaga");
		user.setPassword("666");
		List<User> list = service.selectByUserWhere(user);
		System.out.println(list);
	}
	
	//test choose
	@Test
	public void selectByUserChoose() {
		User user = new User();
		//user.setId(4);
		//user.setUsername("Gaga");
		//user.setPassword("666");
		List<User> list = service.selectByUserChoose(user);
		System.out.println(list);
	}
	
	//test trim
	@Test
	public void selectByUserTrim() {
		User user = new User();
		//user.setId(4);
		user.setUsername("Gaga");
		user.setPassword("666");
		List<User> list = service.selectByUserTrim(user);
		System.out.println(list);
	}
	
	//test foreach select
	@Test
	public void selectByIdsForeach() {
		Integer[] ids = {1,2,3,10};
		List<User> list = service.selectByIdsForeach(ids);
		System.out.println(list);
	}
	
	//test foreach select
	@Test
	public void selectByIdsForeachUser() {
		User user = new User();
		Integer[] ids = {1,2,3,10};
		user.setIds(ids);
		List<User> list = service.selectByIdsForeachUser(user);
		System.out.println(list);
	}
	
	//test trim update
	@Test
	public void updateUserTrim() {
		User user = new User();
		user.setId(3);
		user.setUsername("Hehe");
		user.setPassword("444");
		Integer list = service.updateUserTrim(user);
		System.out.println(list);
	}

	

}
