package service;

import java.io.FileNotFoundException;
import java.io.IOException;

import models.User;

public interface UserService {

	void createUser(String input);
	
	User getUser(String usernameOfUser);

}
