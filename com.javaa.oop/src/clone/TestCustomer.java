package clone;

public class TestCustomer {
	public static void main(String[] args) throws CloneNotSupportedException {
		Customer c1=new Customer("yashita");
		
		Customer c2=(Customer) c1.clone();
		c2.name ="nayna";
		c2.account.balance=200;
		
		Customer c3=(Customer) c1.clone();
		c3.name ="nayna";
		c3.account.balance=300;
		
		System.out.println("original object");
		System.out.println("name="+c1.name+"balance"+c1.account.balance);
		System.out.println("clone object");
		System.out.println("name="+c2.name+"balance"+c2.account.balance);
		System.out.println("clone object");
		System.out.println("name="+c3.name+"balance"+c3.account.balance);
	}
}
