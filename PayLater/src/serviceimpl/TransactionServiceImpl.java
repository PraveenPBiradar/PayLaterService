package serviceimpl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import generic.GenericClass;
import models.User;
import service.TransactionService;

public class TransactionServiceImpl implements TransactionService {

	@Override
	public void createTransaction(String input) throws FileNotFoundException, IOException, ClassNotFoundException {
		String s[]=GenericClass.splitString(input);
		ObjectInputStream inputStream=new ObjectInputStream(new FileInputStream("/Users/praveenbiradar/Documents/prep/ood/objectsood/user.txt"));
		User user=(User)inputStream.readObject();
		if(user.getName().equalsIgnoreCase(s[2])) {
			if(user.getLimit()<=Integer.parseInt(s[4])){
				System.out.println("Success");
			}
			else {
				System.out.println("Rejected");
			}
		}
		else {
			System.out.println("No user");
		}
	}

}
