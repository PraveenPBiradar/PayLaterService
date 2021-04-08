package serviceimpl;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

import exception.MerchantAlreadyExistException;
import exception.UserAlreadyExistException;
import generic.GenericClass;
import models.Merchant;
import models.User;
import service.UserService;

public class UserServiceImpl implements UserService {
	private UserService service;
	
	Map<String,User> map=new HashMap<>();
	@Override
	public void createUser(String input) {
		
		String[] s=GenericClass.splitString(input);
		User user=new User(s[2],s[3],Integer.parseInt(s[4]));
		if(!map.containsKey(s[2])) {
			map.put(s[2], user);
			System.out.println(user.toString());
		}
		else {
			throw new UserAlreadyExistException("User already exists");
		}
//		ObjectOutputStream outputStream=new ObjectOutputStream
//				(new FileOutputStream("/Users/praveenbiradar/Documents/prep/ood/objectsood/user.txt"));
//		outputStream.writeObject(user);
//		System.out.println(user.toString());
	}
	@Override
	public User getUser(String usernameOfUser) {
		return map.get(usernameOfUser);
	}
}
