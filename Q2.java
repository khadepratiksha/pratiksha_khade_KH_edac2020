import java.util.Scanner;
class Q2
{
Scanner sc=new Scanner(System.in);
int n;
int arr[];
int temp[];
int l,sum=0;
void setData()
{
System.out.println("enter array seze");
n=sc.nextInt();
arr=new int[n];
System.out.println("enter array element");
for(int i=0;i<arr.length;i++)
{
arr[i]=sc.nextInt();
}

}


void logic()
{
l=n-2;
temp=new int[l];
for(int i=0;i<l;i++)
{
sum=0;
if(i<l)
{
sum=arr[i]+arr[i+1]+arr[i+2];
sum=sum/l;
temp[i]=sum;
}
}
System.out.println("output");
for(int i=0;i<temp.length;i++)
{
System.out.println(temp[i]);
}

}

public static void main(String args[])
{
Q2 q=new Q2();
q.setData();
q.logic();

}
}
