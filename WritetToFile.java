package filehandling;
import java.io.FileWriter;
import java.io.IOException;
public class WritetToFile {

	public static void main(String[] args) {
		try {
			FileWriter fwriter=new FileWriter("D:name.text");
			fwriter.write("A named location used to store related information is reffered to as a file");
			fwriter.close();
		}catch(IOException e) {
			System.out.println("Unexpected error occured");
			e.printStackTrace();
		}

	}

}
