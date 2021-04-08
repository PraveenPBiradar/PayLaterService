package exception;

@SuppressWarnings("serial")
public class MerchantAlreadyExistException extends RuntimeException {
	public MerchantAlreadyExistException(String message) {
	    super(message);
	  }
}
