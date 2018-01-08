import java.io.File;
import java.util.Date;

public class InfoExtractor {

	public static void main(String[] args){
		File file = new File("src/" + args[0]);
		
		System.out.println("Name: " + file.getName());
		System.out.println("Absolute path: " + file.getAbsolutePath());
		System.out.println("Size: " + file.length());
		System.out.println("Last modified: " + new Date(file.lastModified()));
	}
}
