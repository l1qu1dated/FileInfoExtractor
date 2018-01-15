import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

public class InfoExtractor {
	
	public static String name;
	public static String path;
	public static String size;
	public static String mod;
	public static File file;

	public static void main(String[] args){
		
		openFile();
		
		name = "Name: " + getName();
		path = "Absolute path: " + getPath();
		size = "Size: " + getSize();
		mod = "Last modified: " + getMod();
		
		writeToFile();
		
		System.out.println(name);
		System.out.println(path);
		System.out.println(size);
		System.out.println(mod);
		
	}
	
	public static void openFile() {
		file = new File("src/test.txt");
	}
	
	public static String getName() {
		
		return file.getName();
	}
	
	public static String getPath() {

		return file.getAbsolutePath();
	}
	
	public static long getSize() {
		
		return  file.length();
	}
	
	public static String getMod() {
		
		return new Date(file.lastModified()).toString();
	}
	
	public static void writeToFile() {
		try {
			FileOutputStream fos = new FileOutputStream("fileInfo.txt");
			DataOutputStream outStream = new DataOutputStream(new BufferedOutputStream(fos));
			try {
				outStream.writeUTF(name + path + size + mod);
				outStream.close();
			} catch (IOException e) { e.printStackTrace(); }
			
		} catch (FileNotFoundException e) { e.printStackTrace(); }
	}
}
