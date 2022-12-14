package anudip;
import java.util.*;

class Emp{
	int emp_id;
	String emp_name;
	long emp_phno;
	int salary;
	public void setData(int id,String name,long ph,int sal)
	{
		emp_id=id;
		emp_name=name;
		emp_phno=ph;
		salary=sal;
	}
	public void getData()
	{
		System.out.println("ID: "+emp_id+"\n"+"NAME: "+emp_name+"\n"+"PHONE: "+emp_phno+"\n"+"SALARY: "+salary);
	}
}
public class ClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp e1=new Emp();
		e1.setData(18, "Shrabani", 9823547515l, 25000);
		e1.getData();
	}
}
