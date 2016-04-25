package com.acc.hibernate.dao;

import com.acc.hibernate.pojo.Users;

public class UserDao {
	public Users processUser(Users user) {
		System.out.println("Calling processUser---------------------------");
		user.setName("Raju");
		return user;
	}
	
	public Users generateUser() {

		System.out.println("Calling generateUser---------------------------");
		Users users = new Users("Khoyendra", "khoyendra.pande@accenture.com");
		return users;
	}
}
