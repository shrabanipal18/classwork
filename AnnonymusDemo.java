package thread;
import java.util.*;
class PrintData
{
	synchronized void multiplication(int n)
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(n*i);
			try {
				Thread.sleep(400);
			}catch(InterruptedException e){
				System.out.println(e);
			}
		}
	}
}
public class AnnonymusDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final PrintData pd=new PrintData();
		//Annonymus class
		Thread t1=new Thread()
				{
			public void run()
			{
				pd.multiplication(5);
			}
				};
		Thread t2=new Thread()
				{
			public void run()
			{
				pd.multiplication(100);
			}
				};
				t1.start();
				t2.start();
	}

}
