package oop;

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

	public void withdrawal(double withdrawal) {
		withdrawal = getBalance() - withdrawal;
		setBalance(withdrawal);
	}

	public void fundTransfer(double fundTransfer) {
		fundTransfer = getBalance() - fundTransfer;
		setBalance(fundTransfer);
	}

	public void payBill(double payBill) {
		payBill = getBalance() - payBill;
		setBalance(payBill);
	}

	public static void main(String[] args) {
		Account a = new Account();
		a.setNumber("112345555");
		System.out.println("account number=" + a.getNumber());
		a.setAccountType("saving");
		System.out.println("account type=" + a.getAccountType());
		a.setBalance(1000);
		System.out.println("balance=" + a.getBalance());
		a.Deposit(500);
		System.out.println("deposit="+a.getBalance());
		a.withdrawal(10);
		System.out.println("withdrawal="+a.getBalance());
		a.fundTransfer(100); 
		System.out.println("Fund Transfer="+a.getBalance());
		a.payBill(200);
		System.out.println("pay bill="+a.getBalance());
	}
}
