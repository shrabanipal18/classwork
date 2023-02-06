package thread;
class Table{
	synchronized static void printable(int n)
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(n*i);
			try {
				Thread.sleep(400);
			}catch(InterruptedException e) {
				//TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class SynchronizeTest {

	public static void main(String[] args) {
		Thread t1=new Thread()
				{
			public void run()
			{
				Table.printable(5);
			}
				};
		Thread t2=new Thread()
				{
			public void run()
			{
				Table.printable(10);
			}
				};
		Thread t3=new Thread()
				{
			public void run()
			{
				Table.printable(100);
			}
				};
		Thread t4=new Thread()
				{
			public void run()
			{
				System.out.println("Table of 50");
				Table.printable(50);
			}
				};
		t1.start();
		t2.start();
		t3.start();
		t4.start();

	}

}
