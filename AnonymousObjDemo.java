package anudip;
import java.util.*;

class Fact {
	public void factorial(int n)
	{
		System.out.println("Enter a number: ");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int fact=1;
		for(int i=1;i<=x;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of "+x+" is: "+fact);
	}
}
public class AnonymousObjDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Fact().factorial(0);

	}

}
