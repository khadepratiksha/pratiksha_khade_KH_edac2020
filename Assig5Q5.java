package StringAssignment;
import java.util.*;
public class Assig5Q5 {
	static void count(String str)
	{
		String[] str1=str.split(" ");
		for(int i=0;i<str1.length;i++)
		{
		System.out.println(str1[i].length());
		}
		
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		count(str);
	}

}
