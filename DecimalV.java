import java.util.Scanner;
class DecimalV
{
static void digitcount(double no)
{
int count =0;
while(no!=(long)no) //3.123!= 3123
{
    count++;
    no=no*10;

}
System.out.println(no);
System.out.println(count);


}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter number");
double no=sc.nextDouble();
digitcount(no);

}
}