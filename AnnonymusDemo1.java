package java8;
interface Annonymus
{
	void show();
	void run();
}
public class AnnonymusDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Annonymus obj=new Annonymus() {
			@Override
			public void show()
			{
				System.out.println("Hello anonymus");
			}
			@Override
			public void run()
			{
				System.out.println(5*8);
			}
		};
		obj.show();
		obj.run();

	}

}
