package oop;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {
	private String name;
	private Date dob;
	private String address;
	public static final int AVG_AGE=60;

	public void setname(String na) {
		this.name = na;
	}

	public String getname() {
		return name;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public static int getAge(int age) {
		return age;
	}

	// object
	public static void main(String[] args) throws ParseException {
		Person a = new Person();
		a.setname("Yashita");
		a.setAddress("51,khasgi ka bagicha");
		//Date d = new Date();
		SimpleDateFormat da = new SimpleDateFormat("yyyy/MM/dd");
		String dob = "2002/12/04";
		Date dat = da.parse(dob);
		a.setDob(dat);
		System.out.println("name=" + a.getname());
		System.out.println("address=" + a.getAddress());
		System.out.println("dob=" + a.getDob());
		//a.getAge(18);
		System.out.println("age="+Person.getAge(18));
		System.out.println("avg age="+Person.AVG_AGE);
		
		//new person
		Person b = new Person();
		b.setname("nayna");
		b.setAddress("20B,ratanbagh");
		
		//Date d = new Date(); 
		//SimpleDateFormat g = new SimpleDateFormat("yyyy/MM/dd"); 
		String dobb = "2003/07/01"; 
	    Date datb =da.parse(dobb);
	
		b.setDob(datb);
		System.out.println("name=" + b.getname());
		System.out.println("address=" + b.getAddress());
		System.out.println("dob=" + b.getDob());

	}
}
