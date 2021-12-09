package com.java.thread;

public class ThreadInfo {
	public static void main(String[] args) {
		Thread t = new Thread("my thread");
		log(" ", t);
	}

	private static void log(String indent, Thread t) {
		System.out.println(indent + "thread name=" + t.getName());
		System.out.println(indent + "Id=" + t.getId());
		System.out.println(indent + "priority=" + t.getPriority());
		System.out.println(indent + "state=" + t.getState());
		System.out.println(indent + "is alive=" + t.isAlive());
		System.out.println(indent + "is deamon=" + t.isDaemon());
		System.out.println(indent + "thread group=" + t.getThreadGroup().getName());

	}

}
