import java.util.Scanner;

public class Ascending {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter array elements");
		int n=sc.nextInt();
		int a[]=new int[n];
		int count=0;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}

		for(int i=0;i<a.length;i++)
               {
                for(int j=i+1;j<a.length;j++)
                     {
                   if(a[i]<=a[j])
                    {
                    count++;
                      }
                           }
                               }
		int temp=0;
		
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]<a[i])//88,67,35
				{ 

				temp++;
				}
			}

		} 


		if(count==(n*2))
		{
			System.out.println("Ascending =");
                   for(int i=0;i<n;i++) 
		{
			System.out.print(a[i]+" ");
		}
		}
		else if(temp==(n*2))
		{
                  
			System.out.println("descending");
                 for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		}
		else
		{
                System.out.print("Random =");
                   for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		} 
			
		}
	}

}