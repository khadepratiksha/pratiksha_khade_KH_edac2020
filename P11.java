package Assignment3;

public class P11 {

	public static void main(String[] args) {

		first:
		for(int j=1;j<=5;j++)
		{
			
		second:
		for(int i=1;i<=5;i++)
		{
			if(i==3)
			{
	           break first;
			}
			System.out.println(i);
		}
		}
	System.out.println("bye");
	}

}
