package com.fileinfo;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.Date;
import static java.lang.System.*;

public class FileInfo {

	public static void main(String[] args){
		File file = new File("./test.txt");
		
		System.out.println("Testing line");
		System.out.println("Name: " + file.getName());
		System.out.println("Absolute path: " + file.getAbsolutePath());
		System.out.println("Size: " + file.length());
		System.out.println("Last modified: " + new Date(file.lastModified()));


	}
}