package filehandling;
import java.io.File;
public class DeletingFile {

	public static void main(String[] args) {
		File fo=new File("D:name.text");
		if(fo.delete())
			System.out.println(fo.getName()+" File deleted successfully");
		else
			System.out.println("File not found");

	}

}
