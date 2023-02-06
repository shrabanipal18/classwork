package filehandling;
import java.io.File;
import java.io.IOException;
public class CreateFile {

	public static void main(String[] args) {
		File fo=new File("D:name.text");
		try {
			if(fo.createNewFile())
			{
				System.out.println("File "+fo.getName()+" is created successfully");
			}
			else
				System.out.println("file is already exist in the directory");
		}catch(IOException e) {
			System.out.println("An unexpected error is occurred");
			e.printStackTrace();
		}

	}

}
