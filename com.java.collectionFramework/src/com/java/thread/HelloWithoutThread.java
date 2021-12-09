package com.java.thread;

public class HelloWithoutThread {
	String name=null;
	public HelloWithoutThread(String threadName) {
		name=threadName;
	}
	public void show() {
		for(int i=0;i<100;i++) {
		System.out.println( i +" "+name);
	}
}
/*
 * public static void main(String[] args) { HelloWithoutThread t=new
 * HelloWithoutThread("shin"); HelloWithoutThread t1=new
 * HelloWithoutThread("chan"); t.show(); t1.show(); }
 */
}
