package practice2222;
import java.util.*;
class Bank{
    String name;
    long acount_Number;
    double amount;
    String typeAccount;
    Scanner sc=new Scanner(System.in);
    static double balance;
void createAccount()
{
System.out.println("enter name");
this.name=sc.nextLine();
System.out.println("account_ name number");
this.acount_Number=sc.nextLong();
System.out.println("enter type of Account enter your account is saving or current");
this.typeAccount=sc.next();
System.out.println("you need to first deposite 500 if you not deposite your account will be not consider");
 deposite();
}

double deposite()
{
System.out.println("enter your amount for deposite value");

if(amount<500){
    System.out.println("your balance need to be 500 or more than other wise your acount will not be consider");
    amount=sc.nextDouble();
    balance=balance+amount;
    System.out.println("balance deposite="+balance); 
}
else {
    amount=sc.nextDouble();
    balance=balance+amount;
    System.out.println("balance deposite="+balance); 

}
balanceMethod();
return balance;
}

double balanceMethod()
{
    System.out.println("enter name ="+name);
System.out.println("account_ name number ="+acount_Number);
System.out.println("type_Account ="+typeAccount);
System.out.println("your account  balance ="+balance);
return balance;
}
void withdrawal(){
      
    
     balanceMethod();
    
   if(balance<=500)
    {
        
    
       System.out.println("your account balace is "+balance+"you can not withdrawal");
    
    }
    if(balance>=500)
    {System.out.println("enter amount you want to withdrawal ");
    double temp=balance;
       amount=sc.nextDouble();
   temp=balance-amount;
   if(temp>=500){
   balance=temp;
   }
   else{
   System.out.println("your account balace is not enought  for withdrawal \n your acount balance must be 500 after withdrawal");
   }
 balanceMethod();
    }
  
}
  

 

public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
Bank b=new Bank();
char m;


do{
     System.out.println("enter 1:createAccount or 2:deposite or 3:balanceMethod or 4:withdrawal");
     int ch=sc.nextInt();
    switch(ch){
        case 1:b.createAccount();
        break;
        case 2:b.deposite();
        break;
        case 3:b.balanceMethod();
        break;
        case 4:b.withdrawal();
        break;
        default:
            System.out.println("choose valid option");
            break;
    
    }
  
    System.out.println("Enter y for yes if you want perform same operatin or n for no");
 m=sc.next().charAt(0);
}while((m == 'y') || (m == 'Y'));

}
}