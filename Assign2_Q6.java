package practice2222;
class Assign2_Q6{
public static void main(String args[])
{
 int rows=9;
 for (int i = 1; i <= rows; i++) 
        {
           
             
            for (int j = 1; j < i; j++) 
            {
                System.out.print(" ");
            }
            for(int k=i;k<=rows;k++)
            {
            System.out.print("* ");
            }
            System.out.println();
             
        }
         
}


}