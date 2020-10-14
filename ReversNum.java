import java.util.Scanner;
class ReversNum
{
Scanner sc=new Scanner(System.in);
 int n,rem=0,temp;
void reversNum()
{
n=sc.nextInt();
while(n!=0)
{
//System.out.println(rem);
int temp = n% 10;
            rem = rem * 10 + temp;
            n/= 10;
}
System.out.println(rem);
}
public static void main(String args[])
{
ReversNum r=new ReversNum();
r.reversNum();
}
}