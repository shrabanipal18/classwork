package anudip;
import java.util.Scanner;
public class TernaryOpr {

	public static void main(String[] args) {
		int num1,num2,max;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st number: ");
		num1=sc.nextInt();
		System.out.println("Enter 2nd number: ");
		num2=sc.nextInt();
		max=(num1>num2)?num1:num2; //Ternary Opr
		System.out.println("Greater number is: "+max);
	}

}
