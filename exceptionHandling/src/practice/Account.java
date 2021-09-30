package practice;

public class Account {
	private String number;
	private String accountType;
	private double balance;
	public static final int NO_OF_GEARS=5;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void Deposit(double deposit) {
		System.out.println("You have deposited Rs:"+deposit);
		deposit = getBalance() + deposit;
		System.out.println("Total balance is now "+deposit);
		setBalance(deposit);
	}

	public void withdrawal(double withdrawal) throws InsufficientBalance {
		withdrawal = getBalance() - withdrawal;
		setBalance(withdrawal);
		if(balance<500) {
			InsufficientBalance d= new InsufficientBalance();
			throw d;
		}
	}

	public void fundTransfer(double fundTransfer) {
		fundTransfer = getBalance() - fundTransfer;
		setBalance(fundTransfer);
	}

	public void payBill(double payBill) {
		payBill = getBalance() - payBill;
		setBalance(payBill);
	}
}
