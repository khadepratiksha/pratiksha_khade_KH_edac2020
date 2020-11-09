package Assignment3;

import java.util.Scanner;

class Student
{
	int marks;
String name;
int rollno;
Student()
{
	System.out.println("Hi! i am default constructor");
}

Student(int a,String d,int m)
{
   marks=a;
   name=d;
   rollno=m;
	
}
void print()
{
	System.out.println(marks+" ");
	System.out.println(name+" ");
	System.out.println(rollno+" ");
}
	
}

public class Studentbook {
	
	public static void main(String[] args)
{      Scanner sc=new Scanner(System.in);
		int r;
		String n;
		int m;
		Student arr[]=new Student[5];
		for(int i=0;i<5;i++)
		{
			System.out.println("Enters details of students");
			r=sc.nextInt();
			n=sc.next();
			m=sc.nextInt();
			arr[i]=new Student(r,n,m);
		}
	for(int i=0;i<5;i++)
	{
		arr[i].print();
	}
		

	}

}