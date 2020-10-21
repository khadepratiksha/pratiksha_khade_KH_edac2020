import java.util.Scanner;
class Q1
{
Scanner sc=new Scanner(System.in);
int n;
int m;
int arr[];
int temp[];
int T[];
void setData()
{
System.out.println("enter first array seze");
n=sc.nextInt();
System.out.println("enter second array seze");
m=sc.nextInt();
arr=new int[n];
temp=new int[m];
T=new int[m+n];
System.out.println("enter first array element");
for(int i=0;i<arr.length;i++)
{
arr[i]=sc.nextInt();
}
System.out.println("enter second array element");
for(int i=0;i<temp.length;i++)
{
temp[i]=sc.nextInt();
}
}


void logic()
{
if(arr.length>=temp.length)
{
for(int i=0,k=0;k<T.length;i++)
{
T[k]=arr[i];
if(i<temp.length)
{
k++;
T[k]=temp[i];
}
k++;
}
}
else{
System.out.println("second ");
for(int i=0,k=0;k<T.length;i++)
{
System.out.println(i<arr.length);
if(i<arr.length)
{
T[k]=arr[i];
k++;
}
T[k]=temp[i];
k++;
}
}



for(int i=0;i<T.length;i++)
{
System.out.println("output "+T[i]);
}






}

public static void main(String args[])
{
Q1 q=new Q1();
q.setData();
q.logic();
}
}