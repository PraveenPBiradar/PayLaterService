package serviceimpl;

import exception.TransactionRejectedCreditLimitReached;
import generic.GenericClass;
import models.User;
import service.TransactionService;
import service.UserService;

public class TransactionServiceImpl implements TransactionService {

	private UserService userService;
	int limit=0;

	public TransactionServiceImpl(UserService userService) {
		this.userService=userService;
	}

	@Override
	public void createTransaction(String input) {
		String s[]=GenericClass.splitString(input);
		User user=userService.getUser(s[2]);
		if(user.getName().equalsIgnoreCase(s[2])) {
			if(Integer.parseInt(s[4])<=user.getLimit()){
				limit=user.getLimit()-Integer.parseInt(s[4]);
				if(limit<=user.getLimit()) {
					user.setLimit(limit);
				}
			}
			else {
				System.out.println("rejected! (reason: credit limit)");
			}
		}

	}

}