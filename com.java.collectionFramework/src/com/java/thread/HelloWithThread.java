package com.java.thread;

public class HelloWithThread extends Thread{
	private String name =null;
	
	public HelloWithThread(String threadName) {
		name= threadName;
	}
	public void run() {
		for (int i=0;i<50;i++) {
			System.out.println(i+"hello thread"+name);
		}
	}
	public static void main(String[] args) {
		HelloWithThread t =new HelloWithThread("bear");
		HelloWithThread t1= new HelloWithThread("pooh");
		
		t.start();
		t1.start();
		
		/*
		 * for(int i=0;i<500;i++) { System.out.println("main thread"); }
		 */
		
	}

}
