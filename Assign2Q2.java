package practice2222;
class Assign2Q2{
public static void main(String []args)
{
for(int i=1;i<=9;i++)
{
for (int j=9-i; j>=1; j--)
{
System.out.print(" "); 
}
for(int j=1;j<=i;j++)
{
System.out.print(" "+j);

}
System.out.print("\n");
}
}
}