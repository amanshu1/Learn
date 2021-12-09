package clone;

public class TestEx {
	public static void main(String[] args) {
		Department s=new Department("student");
		System.out.println(s.employe.name);
		System.out.println(s.departmentName);
		System.out.println(s.addres.localAddress);
		System.out.println(s.addres.permanentAddress);
	}
}