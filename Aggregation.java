package oop;
class TCS
{
	int comId;
	String comname;
	Address adrress; //entity
	public int getComId() {
		return comId;
	}
	public String getComname() {
		return comname;
	}
	public Address getAdrress() {
		return adrress;
	}
	public TCS(int comId,String comname,Address adrress) {
		this.comId=comId;
		this.comname=comname;
		this.adrress=adrress;
	}
}
public class Aggregation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address add1=new Address(700032,"Kolkata","India","WB");
		Address add2=new Address(756904,"New York","USA","XYZ");
		TCS com1=new TCS(101,"TCS",add1);
		TCS com2=new TCS(101,"TCS BPS",add2);
		System.out.println("Com_Id: "+com1.getComId()+"\n"+"Company_Name: "+com1.getComname()+"\n"+"Pincode: "+com1.getAdrress().getPincode()+"\n"+"City: "+com1.getAdrress().getCity()+"\n"+"Country"+com1.getAdrress().getCountry()+"\n"+"State: "+com1.getAdrress().getState());

	}

}
