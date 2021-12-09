package com.java.IO;

import java.io.File;
import java.util.Date;

public class Method {
	public static void main(String[] args) {
		File f=new File("D:\\Study");
		if(f.exists()){
			System.out.println("name"+f.getName());
			System.out.println(f.getAbsolutePath());
			System.out.println(f.canWrite());
			System.out.println(f.canRead());
			System.out.println(f.isFile());
			System.out.println(f.isDirectory());
			System.out.println(new Date(f.lastModified()));
			System.out.println(f.length());
		}
		
		
	}
}
