package practice2222;
class Assign2_Q5{
public static void main(String args[])
{   int rows=9;

 for (int i = rows; i >= 1; i--) 
        {
            //Printing i spaces at the beginning of each row
             
            for (int j = 1; j < i; j++) 
            {
                System.out.print(" ");
            }
             
            //Printing i to rows value at the end of each row
             
            for (int j = i; j <= rows; j++)
            {
                System.out.print(j);
            }
            
             for (int k = rows-1; k>= i; k--)
            {
                System.out.print(k);
            }
            
             
                      
            System.out.println();
            
        }
}
}

