package anudip;
abstract class Bank1{
	// we cannot create instance but we can create reference variable
	abstract public void getLoan(); //abstract method with no body
	public void display() //concrete body has body
	{
		System.out.println("This is a Bank Class");
	}
}
class Sbi1 extends Bank1  //child class
{
	public void getLoan() {
		System.out.println("7.5% is the interest");
	}
}
class Axis1 extends Bank1  //child class
{
	public void getLoan() {
		System.out.println("9% is the interest");
	}
}
public class AbstractDemo {  //main class

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank1 bk=new Sbi1(); //creating reference variable bk for Sbi1
		bk.display();
		bk.getLoan();
		bk=new Axis1(); //Another way to create reference variable for child class Axis1
		bk.getLoan();
		bk.display();
	}

}
