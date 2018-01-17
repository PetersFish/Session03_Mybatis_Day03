package cn.peter.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import cn.peter.mapper.UserMapper;
import cn.peter.pojo.User;
import cn.peter.tools.DBUtils;

public class UserService {

	private SqlSessionFactory sf = DBUtils.getSessionFactory();
	
	//test if
	public List<User> selectByUserIf(User user){
		SqlSession session = sf.openSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
		List<User> list = mapper.selectByUserIf(user);
		return list;
	}
	
	//test where
	public List<User> selectByUserWhere(User user){
		SqlSession session = sf.openSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
		List<User> list = mapper.selectByUserWhere(user);
		return list;
	}
	
	//test choose
	public List<User> selectByUserChoose(User user){
		SqlSession session = sf.openSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
		List<User> list = mapper.selectByUserChoose(user);
		return list;
	}
	
	//test trim
	public List<User> selectByUserTrim(User user){
		SqlSession session = sf.openSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
		List<User> list = mapper.selectByUserTrim(user);
		return list;
	}
	
	//test foreach
	public List<User> selectByIdsForeach(Integer[] ids){
		SqlSession session = sf.openSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
		List<User> list = mapper.selectByIdsForeach(ids);
		return list;
	}
	
	//test foreach param user
	public List<User> selectByIdsForeachUser(User user){
		SqlSession session = sf.openSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
		List<User> list = mapper.selectByIdsForeachUser(user);
		return list;
	}
	
	//test trim update
	public Integer updateUserTrim(User user){
		SqlSession session = sf.openSession();
		Integer i = null;
		try {
			UserMapper mapper = session.getMapper(UserMapper.class);
			i = mapper.updateUserTrim(user);
			session.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			session.close();
		}
		return i;
	}
}
