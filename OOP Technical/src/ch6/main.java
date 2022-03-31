package ch6;

import java.io.File;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File FileObj = new File("test1/fun.txt");
		System.out.println("filename = " + FileObj.getName());
		System.out.println("Abs Path = " + FileObj.getAbsolutePath());
		System.out.println("Path = " + FileObj.getPath());
		System.out.println("Parent = " + FileObj.getParent());
		System.out.println("This file exists = " + FileObj.exists());
		System.out.println(FileObj.canRead() + " is readble");
		System.out.println(FileObj.canWrite()+ " is writable");
		System.out.println(FileObj.length());
		System.out.println(FileObj.lastModified());
		
	}

}
