package com.lm.core.service;

import java.util.List;

import com.lm.core.entity.User;


public interface UserHttpClientService {
	List<User> getUserByAcount(String name,String password);
	
	void insert(User user);
}
