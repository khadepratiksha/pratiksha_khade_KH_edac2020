package StringAssignment;
import java.util.Scanner;
public class Assign3Q3 {
	
		  
	    static void printRLE(String s) 
	    { 
	        for (int i = 0; i < s.length(); i++) { 
	  
	            // Counting occurrences of s[i] 
	            int count = 1; 
	            while (i + 1 < s.length() && s.charAt(i)  == s.charAt(i + 1)) { 
	                i++; 
	                
	            } 
	            System.out.print(s.charAt(i)); 
	        } 
	  
	        System.out.println(); 
	    } 
	  
	    // Driver code 
	    public static void main(String args[]) 
	    { Scanner sc=new Scanner(System.in);
	    String s1=sc.nextLine();
	        printRLE(s1); 
	       
	    } 
	} 


