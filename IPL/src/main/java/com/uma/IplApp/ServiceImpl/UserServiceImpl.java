package com.uma.IplApp.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.uma.IplApp.DAO.UserDAO;
import com.uma.IplApp.Model.User;
import com.uma.IplApp.Service.UserService;
@Component
public class UserServiceImpl implements UserService
{
	@Autowired
	private UserDAO userDAO;

	public void addUser(User user) {
		userDAO.addUser(user);
	}

	public User authUser(String email, String password) {
		userDAO.authUser(email, password);
		return userDAO.authUser(email, password);
	}
}
