package filehandling;
import java.io.FileInputStream;
import java.io.FileOutputStream;
public class FileCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fs=null;
		FileOutputStream os=null;
		try {
			fs=new FileInputStream("D:\\test.text");
			os=new FileOutputStream("D:\\dest.text");
			int i=fs.read();
			while(i!=-1)
			{
				os.write(i);
				i=fs.read();
			}
			System.out.println("copy successfull");
		}catch(Exception e)
		{
			System.out.println("An unexpected event occur");
		}finally {
			try {
				if(fs!=null)
					fs.close();
				if(os!=null)
					os.close();
			}catch(Exception e)
			{
				System.out.println(e);
			}
		}

	}

}
