import java.util.Scanner;
class LargeNum
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[];
int temp[]=new int[n];
int max=0;
void setData()
{
System.out.println("enter array elements");
arr=new int[n];
for(int i=0;i<n;i++)
{ 
arr[i]=sc.nextInt();
}

} 

void logic()
{
int first=arr[0];
for(int i=1;i<n;i++)
{
if(arr[i]>first)
{
first=arr[i];
} 
}
int second=Integer.MIN_VALUE;
for(int i=1;i<n;i++)
{
if(arr[i]>second && arr[i]<first)
{
second=arr[i];
} 
}
int third=Integer.MIN_VALUE;
for(int i=1;i<n;i++)
{
if(arr[i]>third && arr[i]<second)
{
third=arr[i];
} 
}

System.out.printf("The third Largest " +  
                  "element is %d\n", third); 
}
public static void main(String args[])
{
System.out.println("enter array size");
LargeNum l=new LargeNum();
l.setData();
l.logic();
}
}