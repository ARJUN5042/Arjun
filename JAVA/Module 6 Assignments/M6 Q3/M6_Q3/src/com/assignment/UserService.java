package com.assignment;

public class UserService
{
	 private UserRepositery userRepository;

	    public void setUserRepository(UserRepositery userRepository) {
	        this.userRepository = userRepository;
	    }

	    public void createUser(String userName) {
	        System.out.println("Creating user: " + userName);
	        userRepository.saveUser(userName);
	    }
}
