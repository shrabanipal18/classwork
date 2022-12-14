package anudip;
import java.util.*;
class Students{
	int id;
	String name;
	int age;
	long phno;
	Students(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	Students(int id,String name,int age)
	{
		this.id=id;
		this.name=name;
		this.age=age;
	}
	Students(int id,String name,int age,long phno)
	{
		this.id=id;
		this.name=name;
		this.age=age;
		this.phno=phno;
	}
	public void display()
	{
		System.out.println("ID: "+id+"\n"+"NAME: "+name+"\n"+"AGE: "+age+"\n"+"PHNO: "+phno);
	}
}
public class ConstructorOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students s1=new Students(12,"Sushmita");
		Students s2=new Students(12,"Sushmita",23);
		Students s3=new Students(12,"Sushmita",23,9823546852l);
		s1.display();
		s2.display();
		s3.display();

	}

}
