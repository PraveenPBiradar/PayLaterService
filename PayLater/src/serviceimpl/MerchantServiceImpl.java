package serviceimpl;

import java.util.HashMap;
import java.util.Map;

import exception.MerchantAlreadyExistException;
import generic.GenericClass;
import models.Merchant;
import service.MerchantService;

public class MerchantServiceImpl implements MerchantService{
	Map<String,Merchant> map=new HashMap<>();
	@Override
	public void createMerchant(String input){
		String[] s=GenericClass.splitString(input);
		Merchant merchant=new Merchant(s[2],s[3],Float.parseFloat((s[4])));
		if(!map.containsKey(s[2])) {
			map.put(s[2], merchant);
			System.out.println(merchant.toString());
		}
		else {
			throw new MerchantAlreadyExistException("Merchant already exists");
		}
		/*ObjectInputStream inputStream=new ObjectInputStream(new FileInputStream("/Users/praveenbiradar/Documents/prep/ood/objectsood/merchant.txt"));
		Merchant existingMerchant=(Merchant)inputStream.readObject();
		if(existingMerchant.getName().equalsIgnoreCase(s[2])) {
			System.out.println("User already exists!!!");
		}
		else {
			ObjectOutputStream outputStream=new ObjectOutputStream
					(new FileOutputStream("/Users/praveenbiradar/Documents/prep/ood/objectsood/merchant.txt"));
			outputStream.writeObject(merchant);*/

	}
}


