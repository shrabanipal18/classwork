/* Create a bank class to calculate withdraw and deposite amount will be given from user. If amount is 
 * sufficient then 'Withdraw Successful' will going to print. Later on deposite 5000rs in the account balance.*/
package anudip;
import java.util.*;

public class Bank {
	static int balance=5000;
	static int PA=5000;
	static int deposite(int amount)
	{
		balance=balance+amount;
		return(balance);
	}
	static int withdraw(int wthd)
	{
		if(PA>wthd) {
			balance=balance-wthd;
			System.out.println("Withdraw Successful");
		}
		else {
			System.out.println("Insufficient Balance");
		}
		return(balance);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		do {
			System.out.println("1.Deposite\n2.Withdraw\n3.Exit");
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter your choice: ");
			int ch=sc.nextInt();
			
			switch (ch) {
			case 1:
				System.out.println("Enter your amount: ");
				int a=sc.nextInt();
				int deposite=Bank.deposite(a);
				System.out.println("Deposite Successful");
				System.out.println("Total balance is "+balance);
				break;
			case 2:
				System.out.println("Enter your amount: ");
				int b=sc.nextInt();
				int withdraw=Bank.withdraw(b);
				System.out.println("Total balance is "+balance);
				break;
			case 3:
				System.exit(0);
			default:System.out.println("Wrong Choice");
			}
		}while(true);

	}

}
