package Assignment;
import java.util.*;
class Gen<T>
{
	
	

	 public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
		    T max = x;

		    if (y.compareTo(max) > 0)
		      max = y; 

		    if (z.compareTo(max) > 0)
		      max = z; 
		    return max; 
		  }
}

	

public class GenericLarge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Double x=sc.nextDouble();
		Double y=sc.nextDouble();
		Double z=sc.nextDouble();
		//Gen<Integer> t=new Gen<Integer>();
		Gen<Double> t=new Gen<Double>();
		//Gen<Float> t=new Gen<Float>();
		
		System.out.println(t.maximum(x,y,z));
		

	}

}
