package serviceimpl;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import generic.GenericClass;
import models.User;
import service.UserService;

public class UserServiceImpl implements UserService {

	@Override
	public void createUser(String input) throws FileNotFoundException, IOException {
		String[] s=GenericClass.splitString(input);
		User user=new User();
		user.setName(s[2]);
		user.setEmail(s[3]);
		user.setLimit(Integer.parseInt(s[4]));
		ObjectOutputStream outputStream=new ObjectOutputStream
				(new FileOutputStream("/Users/praveenbiradar/Documents/prep/ood/objectsood/user.txt"));
		outputStream.writeObject(user);
		System.out.println(user.toString());
	}
}
