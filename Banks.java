package Assignment3;
import java.util.Scanner;

class Bank
{
	static int minbal=1000;
	static int bal=500;
	
	void details()
	{ 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your id");
		int custId=sc.nextInt();
		System.out.println(" your id is "+custId);
		System.out.println("Enter your name ");
		String name=sc.next();
		System.out.println(" your name is "+name);
		System.out.println(" enter amount");
		int amount =sc.nextInt();
		System.out.println(" your amount is "+amount);
		
	}
	void deposit()
	{
		Scanner sc=new Scanner(System.in);
		int money;
		System.out.println("Enter amount you want to deposit");
		money=sc.nextInt();
		bal=bal+money;
		System.out.println("available balance"+bal);
	}
	void withdraw()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter amount you want to withdraw");
		int amount=sc.nextInt();
		if(amount<minbal)
		{ 
			minbal=minbal-amount;
			System.out.print("balance"+minbal);
		}
		else
		{
			System.out.println("NA");
		}
	}
	
}
public class Banks {

	public static void main(String[] args) 
	{
		Bank b=new Bank();
		b.details();
		b.deposit();
		b.withdraw();

	}

}