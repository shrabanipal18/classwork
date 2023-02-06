package thread;
class Acc
{
	int accBalance=10000;
	synchronized void  withdraw(int amount)
	{
		System.out.println("start withdrawing");
		if(this.accBalance<amount)
		{
			System.out.println("less balance: waiting for deposite");
			try {
				wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.accBalance=accBalance-amount;
		System.out.println(amount+" is withdrawn successfully");
	}
	synchronized void deposite(int amount)
	{
		System.out.println("start deposite");
		this.accBalance=accBalance=amount;
		System.out.println(amount+" deposite successfull");
		notifyAll();
	}
	synchronized void display() throws
	InterruptedException
	{
		try {
			wait();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("fetching your acc balance");
		for(int c=0;c<=5;c++)
		{
			Thread.sleep(1000);
			System.out.println(".");
		}
		System.out.println("your current acc balance is: "+this.accBalance);
	}
}
public class InterThreadCommunicationDemo {

	public static void main(String[] args) {
		final Acc ac=new Acc();
		new Thread() {
			public void run()
			{
				ac.withdraw(15000);
			}
		}.start();
		new Thread() {
			public void run()
			{
				try {
					ac.display();
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		}.start();
		new Thread() {
			public void run()
			{
				ac.deposite(20000);
			}
		}.start();
	}

}
