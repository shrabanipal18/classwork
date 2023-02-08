package java8;
interface Annnonymus{
	int addition(int a,int b);
}
public class AnnonymusDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Annnonymus sum=(int a,int b)->{
			return a+b;
		};
		System.out.println(sum.addition(4, 5));
	}

}
