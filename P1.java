package Assignment3;

public class P1 {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		int w = a++ + b++;// 10 20 // 11 21
		System.out.println(w);// 30
		int x = ++a + ++b;// 12 22
		System.out.println(x);// 34
		int y = a-- + b--;// 12 22 // 11 21
		System.out.println(y);// 34
		int z = --a + --b;// 10 20
		System.out.println(z);// 30

	}

}
