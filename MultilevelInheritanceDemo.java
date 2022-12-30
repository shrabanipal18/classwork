package inheritance;
class Animal //Grand parent
{
	public void display()
	{
		System.out.println("Animal");
	}
}
class Dog extends Animal //Parent
{
	public void dog()
	{
		System.out.println("Dog is barking...");
	}
}
class Puppy extends Dog //Child
{
	public void puppy()
	{
		System.out.println("Child of dog");
	}
}
public class MultilevelInheritanceDemo {

	public static void main(String[] args) {
		Puppy puppy=new Puppy();
		puppy.display();
		puppy.dog();
		puppy.puppy();

	}

}
