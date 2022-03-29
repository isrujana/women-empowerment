package com.womenempowerment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.womenempowerment.dao.IUserDao;
import com.womenempowerment.model.User;
@Service
public class IUserServiceImpl implements IUserService{
	@Autowired
	IUserDao dao;

	public void registerUser(User user) {
		dao.save(user);
	}

//	@Override
//	public User login(String username, String password) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public User forgotPassword(User user) {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
