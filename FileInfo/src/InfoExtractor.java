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
		if (args.length > 1 || args.length < 1) {
			System.out.println("You need to specify the name of the file");
			
		}else {
			file = new File("src/" + args[0]);
		
			name = getName();
			path = getPath();
			size = "Size: " + getSize() + "\n";
			mod = getMod();
		
			writeToFile();
		}
	}
	
	public static String getName() {
		System.out.println("Name: " + file.getName());
		
		return "Name: " + file.getName() + "\n";
	}
	
	public static String getPath() {
		System.out.println("Absolute path: " + file.getAbsolutePath());

		return "Absolute Path: " + file.getAbsolutePath() + "\n";
	}
	
	public static long getSize() {
		System.out.println("Size: " + file.length());
		
		return  file.length();
	}
	
	public static String getMod() {
		System.out.println("Last modified: " + new Date(file.lastModified()));
		
		return "Last modified: " + new Date(file.lastModified()) + "\n";
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
