import java.util.Scanner;
class Order
{
Scanner sc=new Scanner(System.in);
int n;
int arr[];
int arr1[];
int arr2[];
void setData()
{
n=sc.nextInt();
arr=new int[n];
arr1=new int[n];
arr2=new int[n];
System.out.println("enter element");
for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
System.out.println("enter second element");
for(int i=0;i<n;i++)
{
arr1[i]=sc.nextInt();
}
System.out.println("enete third element");
for(int i=0;i<n;i++)
{
arr2[i]=sc.nextInt();
}
System.out.println("output");

for(int var:arr)
{
System.out.println(var);
}
System.out.println("output");
for(int var:arr1)
{
System.out.println(var);
}
System.out.println("output");
for(int var:arr2)
{
System.out.println(var);
}

}

void orderList(){


}

public static void main(String args[])
{
Order p=new Order();
p.setData();
p.orderList();
}

}