package StringAssignment;

public class Assign5Q7 {
static void display(String str)
{
	char ch[]=str.toCharArray();
	int len=str.length();
	char ch1[]=new char[len];
	str.toLowerCase().charAt(0);
	for(int i=0;i<ch.length;i++)
	{
		for(char j='A';j<='Z';j++)
		{
			if(ch[i]==j)
			{
				
				ch1[i]=Character.toLowerCase(ch[i]);
			}
		}
		for(char j='a';j<='z';j++)
		{
			if(ch[i]==j)
			{
				ch1[i]=Character.toUpperCase(ch[i]);
				
			}
		}
				
			
		
		
	}
	String s=new String(ch1);
	System.out.print(s);
	
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="HEllo World";
display(str);
	}

}
