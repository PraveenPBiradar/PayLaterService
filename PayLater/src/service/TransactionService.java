package service;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface TransactionService {

	void createTransaction(String input) throws FileNotFoundException, IOException, ClassNotFoundException;

}
