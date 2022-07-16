package com.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.user.entity.User;

@Service
public class UserServiceImpl implements UserService {

	//fake user list
	List<User> userList = List.of(
			new User(1L, "Shivani", "6584984944"),
			new User(2L, "John", "86645845"),
			new User(3L, "Albert", "32164848")
			);
	
	@Override
	public User getUser(Long id) {
		return userList.stream().filter(user->user.getUserId()==id).findAny().orElse(null);
	}

}
