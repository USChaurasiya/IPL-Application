package com.uma.IplApp.DAO;

import com.uma.IplApp.Model.User;

public interface UserDAO {
	void addUser(User user);

	User authUser(String email, String password);
	

}
