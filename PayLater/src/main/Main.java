package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import generic.GenericClass;
import service.MerchantService;
import service.TransactionService;
import service.UserService;
import serviceimpl.MerchantServiceImpl;
import serviceimpl.TransactionServiceImpl;
import serviceimpl.UserServiceImpl;

public class Main {

	static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	private static UserService userService;
	private static MerchantService merchantService;
	private static TransactionService txnService;

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		configureObjects();
		while(true) {
			String input=br.readLine();
			System.out.println("input ===> "+input);
			if(GenericClass.splitString(input)[1].equalsIgnoreCase("user")) {
				createUser(input);
			}
			if(GenericClass.splitString(input)[1].equalsIgnoreCase("merchant")) {
				createMerchant(input);
			}
			if(GenericClass.splitString(input)[1].equalsIgnoreCase("txn")) {
				checkUserAndCreateTxn(input);
			}
			if(GenericClass.splitString(input)[0].equalsIgnoreCase("update")) {
				checkUserAndCreateTxn(input);
			}
		}
	}

	private static void configureObjects() {
		userService=new UserServiceImpl();
		merchantService=new MerchantServiceImpl();
		txnService=new TransactionServiceImpl(userService);
	}

	public static void createUser(String input) {
		userService.createUser(input);
	}

	public static void createMerchant(String input){
		merchantService.createMerchant(input);
	}

	private static void checkUserAndCreateTxn(String input) {
		txnService.createTransaction(input);
	}
}
