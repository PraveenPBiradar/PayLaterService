package service;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface UserService {

	void createUser(String input) throws FileNotFoundException, IOException;

}
