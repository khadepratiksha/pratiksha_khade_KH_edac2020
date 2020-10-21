import java.util.Scanner;
class Series
{
Scanner sc=new Scanner(System.in);
int n,i=1;
int res=0;
int []arr;
void setData()
{
n=sc.nextInt();
arr=new int[n];
while(i<=n)
{
if(i%2==0)
{
//System.out.print("hello");
res=(int)(Math.pow(i,2));
System.out.println(res);
}
else
{
res=(int)(Math.pow(i,3));
System.out.println(res);
}
i++;
}

}
public static void main(String args[])
{
Series s=new Series();
s.setData();

}
}