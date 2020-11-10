package Assignment;


import java.util.Scanner;
public class FloatLarge {

float calculate(float x,float y,float z) {
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
		FloatLarge t=new FloatLarge();
		
Scanner sc=new Scanner(System.in);
float x=sc.nextFloat();
float y=sc.nextFloat();
float z=sc.nextFloat();

System.out.println(t.calculate(x,y,z));


	}


}
