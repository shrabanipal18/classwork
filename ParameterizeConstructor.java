package anudip;
import java.util.*;

class Student{
	int roll;
	String name;
	Student(int x,String y)
	{
		roll=x;
		name=y;
	}
	void display()
	{
		System.out.println("Roll: "+roll+"Name: "+name);
	}
}
public class ParameterizeConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student shrabani=new Student(105,"Shrabani");
		shrabani.display();
		Student samaya=new Student(108,"Samaya");
		samaya.display();

	}

}
