package com.service;

import java.util.List;

import com.model.User;

public interface UserService 
{
	User findById(Long id);

	User findByEmail(String email);

	List<User> findAll();

	void save(User user);

	void update(User user);

	void delete(Long id);

	boolean isEmailUnique(String email);
}
