package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TeatMarksheet{
	public static void main(String[] args) {
		Marksheet m1= new Marksheet();
		m1.setRollNo("1");
		m1.setfName("clay");
		m1.setLname("jensen");
		m1.setPhysics(88);
		m1.setChemistry(73);
		m1.setMaths(89);
		
		Marksheet m2= new Marksheet();
		m2.setRollNo("3");
		m2.setfName("clay");
		m2.setLname("foley");
		m2.setPhysics(44);
		m2.setChemistry(67);
		m2.setMaths(75);
		
		Marksheet m3= new Marksheet();
		m3.setRollNo("2");
		m3.setfName("hannah");
		m3.setLname("baker");
		m3.setPhysics(92);
		m3.setChemistry(93);
		m3.setMaths(99);
		
		ArrayList a= new ArrayList();
		a.add(m1);
		a.add(m2);
		a.add(m3);
		Collections.sort(a);
		Iterator it = a.iterator();
		
		while (it.hasNext()) {
			Marksheet m = (Marksheet) it.next();
			System.out.println(m.getRollNo()+" "+m.getfName()+" "+m.getLname()+" "+m.getPhysics()+" "+m.getChemistry()+" "+m.getMaths());
		}		
	}
}