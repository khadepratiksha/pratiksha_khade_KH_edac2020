import java.util.Scanner;
class Assign_Q12{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter three number for average calculation");
int result;
System.out.println("Enter first number ");
   int n1=sc.nextInt();
System.out.println("Enter second number ");
   int n2=sc.nextInt();
System.out.println("Enter  third number ");
   int n3=sc.nextInt();
  result=(n1+n2+n3)/3;
System.out.println("result = "+result);
}

}