package Interface;
interface Printable1
{
	void display();
	void fun();
	}
interface Drawable extends Printable1
{
	void draw();
	}
interface sayable
{
	void say();
	}
class Print1 implements Drawable
{

	@Override
	public void display() {
		System.out.println("Display the msg");		
	}

	@Override
	public void fun() {
		System.out.println("Learning is fun");
	}

	@Override
	public void draw() {
		System.out.println("Draw something");
		
	}
}
class Message1 implements Drawable,sayable
{

	@Override
	public void display() {
System.out.println("Hello world");		
	}

	@Override
	public void fun() {
System.out.println("This is fun");		
	}

	@Override
	public void say() {
System.out.println("say something");		
	}

	@Override
	public void draw() {
		System.out.println("Draw circle");
	}
	
}
public class InterfaceDemo1 {

	public static void main(String[] args) {
		Print1 p=new Print1();
		p.display();
		p.fun();
		p.draw();
		Message1 msg=new Message1();
		msg.display();
		msg.fun();
		msg.say();
		msg.draw();
	}
}
