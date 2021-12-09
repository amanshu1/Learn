package constructor;

public class Person1 {
	protected String firstName = null;
	protected String lastName = null;
	protected String address = null;
	protected String changeAddress=null;
	

	public Person1() {
		System.out.println("person deflaut");
	}

	public Person1(String fn, String ln) {
		firstName = fn;
		lastName = ln;
		System.out.println("2nd constructor called");
	}

	public Person1(String fn, String ln, String addr) {
		this(fn, ln);
		this.address = addr;
		System.out.println("3rd constructor called with 2nd");
	}
	public void changeAddress() {
		System.out.println("person change address");
	}
	public static void main(String[] args) {
		Person1 a= new Person1("yashita","sahu","indore");
	    System.out.println(a.firstName+" "+a.lastName+" "+a.address);
		
	}
}
