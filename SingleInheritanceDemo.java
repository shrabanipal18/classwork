package inheritance;
class User{
	int id;
	String name;
	String address;
	public User(int id,String name,String address)
	{
		this.id=id;
		this.name=name;
		this.address=address;
	}
	public void display()
	{
		System.out.println("Id: "+id+"\n"+"Name: "+name+"\n"+"Address: "+address+"\n");
	}
}
class Employee extends User{
	double salary;
	String designation;
	public Employee(int id,String name,String address,double salary,String designation)
	{
		super(id,name,address);
		this.salary=salary;
		this.designation=designation;
	}
	public void getData()
	{
		super.display();
		System.out.println("Salary: "+salary+"\n"+"Designation: "+designation);
	}
}
public class SingleInheritanceDemo {

	public static void main(String[] args) {
		Employee emp1=new Employee(105,"Shrabani","Kolkata",30000,"Manager");
		emp1.getData();

	}

}
