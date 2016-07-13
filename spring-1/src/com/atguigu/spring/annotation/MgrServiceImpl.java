package com.atguigu.spring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("mgrServiceImpl")
public class MgrServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	public void addNew() {
		System.out.println("添加新管理员");
		userDao.save();
	}
}
