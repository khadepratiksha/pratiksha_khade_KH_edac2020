package practice2222;
class Assign2_Q4
{
public static void main(String []args)
{
for(int i=1;i<=9;i++)
{
for(int k=i;k<=9;k++)
{
System.out.print(" ");
}
for(int j=1;j<=i;j++)
{
System.out.print(j);
}
for(int m=i-1;m>=1;m--)
{
System.out.print(m);

}
System.out.print("\n");
}

}
}