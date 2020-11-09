package StringAssignment;
import java.util.Scanner;
public class Assign1 {

		static int Vowels=0;
		static int Consonants=0;
		static int Numbers=0;
	      static int Others=0;
	      static int space=0;
		 static void check(String s) {
			// TODO Auto-generated method stub
			 
			char ch[]=s.toCharArray();
			
			
			for(int i=0;i<s.length();i++)
			{
				
				if(ch[i]=='a'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'||ch[i]=='e'||ch[i]=='A'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U'||ch[i]=='E')
				{
					Vowels++;
				}else if((ch[i]>='a'||ch[i]>='A')&&(ch[i]<='z'||ch[i]<='Z'))
				{
					Consonants++;
				}
				else if(Character.isDigit(ch[i]))
				{
					Numbers++;
				}
				else if(Character.isSpace(ch[i])){
					space ++ ;
				}
				else {
					Others++;
				}
			}
			System.out.println("Vowels "+Vowels+"\nConsonants "+Consonants+"\nNumber "+Numbers+"\nSpace "+space+"\nOthers "+Others);
					
				}	
			
			
			
			
			
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	check(s);

		}

		

	}