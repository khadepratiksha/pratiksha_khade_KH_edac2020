import java.util.Scanner;
class Resultexp{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int y=sc.nextInt();
int x=sc.nextInt();
int z=sc.nextInt();
y = (x*x)+(3*x)-7;
y = x++ + ++x;
System.out.println("value y ="+y);
z = x++ - --y - --x  +  x++;
System.out.println("value x = "+x+"\nvalue ="+y);
expresion();
}
static void expresion()
{
 boolean x=true;
boolean y=false;
boolean z;
z=x&&y || !(x || y);
System.out.println("value = "+z);
}

}