package Assignment3;

public class P2 {

	public static void main(String[] args) {

		byte b1 = 10;
		byte b2 = 20;
		int x = b1 + b2;// upcasting
		System.out.println(x);
		
		int i = 30;
		int j = 40;
		short s = (short) (i + j);//downcasting
		System.out.println(s);
	}

}
