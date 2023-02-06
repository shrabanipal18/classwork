package filehandling;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromFile {

	public static void main(String[] args) {
		File f1=new File("D:name.text");
		Scanner dataReader;
		try {
			dataReader=new Scanner(f1);
			while(dataReader.hasNextLine())
			{
				String fileData=dataReader.nextLine();
				System.out.println(fileData);
			}
			dataReader.close();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
