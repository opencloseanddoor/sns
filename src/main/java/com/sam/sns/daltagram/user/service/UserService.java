package com.sam.sns.daltagram.user.service;

import com.sam.sns.daltagram.user.domain.User;

public class UserService 	
{
	public User getUserById(int id)
	{
		return userRepository.selectUserById(id);
	}
}
