package practice;

public class InsufficientBalance extends Exception{
	public InsufficientBalance() {
		super("your funds are insufficient");
	}
}
