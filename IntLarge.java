package Assignment;
import java.util.*;
public class IntLarge {

int calculate(int x,int y,int z) {
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
		IntLarge t=new IntLarge();
		
Scanner sc=new Scanner(System.in);
int x=sc.nextInt();
int y=sc.nextInt();
int z=sc.nextInt();
System.out.println(t.calculate(x,y,z));


	}


}
