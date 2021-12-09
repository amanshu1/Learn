package practice;

import java.util.ArrayList;
import java.util.List;

public class Collectionn {
	public static void main(String[] args) {
		List l=new ArrayList();
		//add
		l.add(10);
		l.add('a');
		l.add(22.3);
		System.out.println(l);
		System.out.println(l.contains(10));
		System.out.println(l.remove(1));
		System.out.println("size="+l.size());
		//System.out.println(l.removeAll(l));
		for (Object o: l) {
			System.out.println(o);
		}
		//addAll
		List a=new ArrayList();
		a.addAll(l);
		System.out.println(a);
		a.clear();
		System.out.println(a);
		System.out.println(a.isEmpty());
		System.out.println(a.retainAll(a));
		}
}