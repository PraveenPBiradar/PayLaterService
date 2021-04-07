package serviceimpl;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import generic.GenericClass;
import models.Merchant;
import service.MerchantService;

public class MerchantServiceImpl implements MerchantService{

	@Override
	public void createMerchant(String input) throws FileNotFoundException, IOException {
		String[] s=GenericClass.splitString(input);
		Merchant merchant=new Merchant();
		merchant.setName(s[2]);
		merchant.setEmail(s[3]);
		merchant.setDiscount(Float.parseFloat((s[4])));
		ObjectOutputStream outputStream=new ObjectOutputStream
				(new FileOutputStream("/Users/praveenbiradar/Documents/prep/ood/objectsood/object.txt"));
		outputStream.writeObject(merchant);
		System.out.println(merchant.toString());
	}

}
