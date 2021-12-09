package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Marksheet implements Comparable<Marksheet>{
	private String rollNo;
	private String fName;
	private String Lname;
	private int physics;
	private int chemistry;
	private int maths;
	
	public Marksheet() {}

	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getLname() {
		return Lname;
	}

	public void setLname(String lname) {
		Lname = lname;
	}

	public int getPhysics() {
		return physics;
	}

	public void setPhysics(int physics) {
		this.physics = physics;
	}

	public int getChemistry() {
		return chemistry;
	}

	public void setChemistry(int chemistry) {
		this.chemistry = chemistry;
	}

	public int getMaths() {
		return maths;
	}

	public void setMaths(int maths) {
		this.maths = maths;
	}
	
	public int compareTo(Marksheet o) {
		return this.fName.compareTo(o.fName);
	}
}