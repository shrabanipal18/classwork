package java8;
interface Anonymus
{
	void show();
}
public class AnnonymusDemo {

	public static void main(String[] args) {
		Anonymus lamda=()->{
			System.out.println("Hi anonymus");
		};
		lamda.show();
		
	}

}
