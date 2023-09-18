package com.jwt.example.jwtexample3.services;


import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.jwt.example.jwtexample3.models.User;

@Service
public class UserService {

	private List<User> store = new ArrayList<>(); 
	
	public UserService()
	{
		store.add(new User(UUID.randomUUID().toString(),"n","a@v"));
		store.add(new User(UUID.randomUUID().toString(),"na","aa@v"));
		store.add(new User(UUID.randomUUID().toString(),"nam","ab@v"));
		store.add(new User(UUID.randomUUID().toString(),"name","ac@v"));
		
		
	}
	public List<User> getUser()
	{
		return this.store;
	}
}
