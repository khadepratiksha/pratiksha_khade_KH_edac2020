import java.util.Scanner;
class SimpleInt
{
Scanner sc=new Scanner(System.in);
int p,r,t;
double interest;
void setData()
{
System.out.println("enter principle");
p=sc.nextInt();
System.out.println("enter rate");
r=sc.nextInt();
System.out.println("enter time");
t=sc.nextInt();
}
void simpleInterest()
{
interest=(p*r*t)/100;
System.out.println("interest"+interest);
}

public static void main(String args[])
{
SimpleInt s=new SimpleInt();
s.setData();
s.simpleInterest();

} 

}