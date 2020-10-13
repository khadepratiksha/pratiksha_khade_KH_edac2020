import java.util.Scanner;
class Circle
{
double pi=3.14;
void areaOfCircle(float r)
{
System.out.println(r*r*pi);
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter radius");
float r=sc.nextFloat();
Circle c=new Circle();
c.areaOfCircle(r);

}

}