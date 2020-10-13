import java.util.Scanner;
class Student{

Scanner sc=new Scanner(System.in);
int arr[]=new int[5];
double sum=0;
double avg;

//taking input
void setData(){
System.out.println("enter number five subject marks 0)math,1)english, 2)physics,3)chemistry,4) maths ");
for(int i=0;i<5;i++)
{
switch (i)
{
case 0:
    System.out.println("enter math mark");
break;
case 1:
    System.out.println("enter english mark");
break;
case 2:
    System.out.println("enter physics mark");
break;
case 3:
    System.out.println("enter chemistry mark");
break;
case 4:
    System.out.println("enter computer  mark");
break;
default:
     System.out.println("reffer above those subject ");
break;

      
}
arr[i]=sc.nextInt();
}
}

//display data
void display()
{

}

void percentage(){
for(int i=0;i<5;i++)
{
sum=sum+arr[i];
}

//avg=(sum / 500)*500;
avg=(sum / (5* 100)) * 100;
System.out.println("percentage ="+avg+"%");
}

public static void main(String args[])
{
Student s=new Student();
s.setData();
s.display();
s.percentage();
}

}