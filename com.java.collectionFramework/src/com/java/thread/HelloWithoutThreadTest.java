package com.java.thread;

public class HelloWithoutThreadTest {
	public static void main(String[] args) {
		HelloWithoutThread t=new HelloWithoutThread("shin");
		HelloWithoutThread t1=new HelloWithoutThread("chan");
		t.show();
		t1.show();
	}

}
