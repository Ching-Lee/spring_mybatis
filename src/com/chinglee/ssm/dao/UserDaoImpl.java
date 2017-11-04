package com.chinglee.ssm.dao;

import com.chinglee.ssm.po.User;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;


public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {

	@Override
	public User findUserById(int id) throws Exception {
		//继承SqlSessionDaoSupport，通过this.getSqlSession()得到sqlSessoin
		SqlSession sqlSession = this.getSqlSession();

		User user = sqlSession.selectOne("test.findUserById", id);

		return user;

	}
	
	


}
