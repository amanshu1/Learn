package practice;

public class TestAccout {
	public static void main(String[] args) throws InsufficientBalance {
		Account a = new Account();
		  a.setNumber("112345555");
		  System.out.println("account number=" +a.getNumber()); a.setAccountType("saving");
		  System.out.println("account type=" + a.getAccountType()); 
		  a.setBalance(500);
		  System.out.println("balance=" + a.getBalance()); 
		  a.Deposit(0);
		  System.out.println("deposit="+a.getBalance()); 
		  a.withdrawal(100);
		  System.out.println("withdrawal="+a.getBalance());
		  a.fundTransfer(0);
		  System.out.println("Fund Transfer="+a.getBalance()); 
		  a.payBill(0);
		  System.out.println("pay bill="+a.getBalance());
	}

}
