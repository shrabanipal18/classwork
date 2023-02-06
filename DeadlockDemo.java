package thread;

public class DeadlockDemo {

	public static void main(String[] args) {
		final String resource1="paper";
		final String resource2="pen";
		// thread1: Prasanta lock resource1: paper and wanted to lock resource2: pen
		Thread prasanta=new Thread()
				{
			public void run()
			{
				synchronized(resource1)
				{
					System.out.println("Prasanta locked Resource 1: paper");
					try {
						Thread.sleep(100);
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
					// thread1: Prasanta trying to lock resource2: pen
					synchronized(resource2)
					{
						System.out.println("wanted to lock resource2: pen");
					}
				}
			}
				};
		// thread2: Sachin lock resource2: pen and try to lock resource1: paper
		Thread sachin=new Thread()
				{
			public void run()
			{
				synchronized(resource2)
				{
					System.out.println("Sachin locked Resource 2: pen");
					try {
						Thread.sleep(100);
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
					// thread2: Sachin trying to lock resource1: paper
					synchronized(resource1)
					{
						System.out.println("wanted to lock resource1:paper");
					}
				}
			}
				};
		prasanta.start();
		sachin.start();

	}

}
