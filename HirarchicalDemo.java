package inheritance;
// Parent class
class Bank{
	public void loanInterest()
	{
		System.out.println("9% Interest");
	}
}
// SBI is sub class which inherit parent class Bank
class SBI extends Bank{
	public void sbiLoan()
	{
		System.out.println("For SBI");
	}
}
//HDFC is sub class which inherit parent class Bank
class HDFC extends Bank{
	public void hdfcLoan()
	{
		System.out.println("For HDFC");
	}
}
//AXIS is sub class which inherit parent class Bank
class AXIS extends Bank{
	public void axisLoan()
	{
		System.out.println("For AXIS");
	}
}
public class HirarchicalDemo {

	public static void main(String[] args) {
		AXIS ax=new AXIS();
		ax.axisLoan();
		ax.loanInterest();
		HDFC hd=new HDFC();
		hd.hdfcLoan();
		hd.loanInterest();
		SBI sb=new SBI();
		sb.sbiLoan();
		sb.loanInterest();

	}

}
