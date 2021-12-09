package constructor;

public class Employee extends Person1{
	private String designation = null;
	
	public Employee() {
		System.out.println("default employee");
	}
	public Employee(String fn,String ln,String addr,String des) {
		super(fn,ln,addr);
		designation=des;
		System.out.println("3 parameter constructor");
	}

	/*
	 * public void changeAddress() { System.out.println("las vegas");
	 * super.changeAddress(); System.out.println("employee change address"); }
	 */
	public static void main(String[] args) {
		Employee a=new Employee("yashita","sahu","indore","devloper");
		System.out.println(a.firstName+" "+a.lastName+" "+a.address+" "+a.designation);		
		
	}
}
	
