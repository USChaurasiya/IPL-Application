package com.uma.IplApp.Service;

import com.uma.IplApp.Model.User;

public interface UserService {

	void addUser(User user);

	User authUser(String email, String password);
}
