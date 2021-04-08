package exception;

public class TransactionRejectedCreditLimitReached extends RuntimeException {
	public TransactionRejectedCreditLimitReached(String msg) {
		super(msg);
	}
}
