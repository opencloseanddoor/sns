package com.sam.sns.daltagram.user.repositroy;

import org.apache.ibatis.annotations.Param;

import com.sam.sns.daltagram.user.domain.User;

public interface UserRepository 
{
	public User selectUserById(@Param("id") int id);
}
