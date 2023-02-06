package filehandling;
import java.io.File;
public class FileInfo {

	public static void main(String[] args) {
		File fo=new File("D:name.text");
		if(fo.exists())
		{
			System.out.println("The name of the file is: "+fo.getName());
			System.out.println("The absolute path of this file: "+fo.getAbsolutePath());
			System.out.println("Is file writable? "+fo.canWrite());
			System.out.println("Is file readable? "+fo.canRead());
			System.out.println("The size of the file in byte is: "+fo.length());
		}
		else
			System.out.println("File does not exist");

	}

}
