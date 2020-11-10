package Assignment;


import java.util.Scanner;
public class DoubleLarge {

double calculate(double x,double y,double z) {
		if(x>y && x>z)
		{
			return x;
		}
		else if(y>z)
		{
			return y;
		}
		else
		{
		return z;
		}
		
	}
	public static void main(String[] args) {
		DoubleLarge t=new DoubleLarge();
		
Scanner sc=new Scanner(System.in);
double x=sc.nextDouble();
double y=sc.nextDouble();
double z=sc.nextDouble();

System.out.println(t.calculate(x,y,z));


	}
	


}
