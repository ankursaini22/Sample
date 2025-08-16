package com.EKart.Company.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EKart.Company.Dao.UserDao;
import com.EKart.Company.Entities.User;

@Service
public class UserService {
	
	@Autowired
	UserDao userdao;
	
	public List<User> fetchAllUser(){
		return userdao.findAll();
	}

}
