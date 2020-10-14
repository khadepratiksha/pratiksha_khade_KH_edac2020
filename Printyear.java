import java.util.Scanner;
class Printyear{
Scanner sc=new Scanner(System.in);
int days,year,rem,rem2,month,daysrem,week;

void setData()
{
System.out.println("enter days ");
days = sc.nextInt();

}

void display()
{
year=(days/365);
rem=(days%365);
week=days/7;
rem2=days%7;
month=days/30;
System.out.println("how many days month and week in "+days+"is \n days "+days+"\n year ="+year+"\n week="+week+"\n month ="+month);

}

void remdisplay()
{
year=(days/365);
rem=(days%365);
week=rem/7;
rem2=rem%7;
month=rem/30;
daysrem=rem%30;
System.out.println("+++++++++++++++\n Remainig year ="+year+"\n Remainig week="+week+"\n Remainig month ="+month+"\n Remainig days ="+daysrem);

}


public static void main(String args[])
{
Printyear p=new Printyear();
p.setData();
p.display();
p.remdisplay();
}
}