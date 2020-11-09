package Assignment3;

import java.util.Scanner;

public class P7 {

	public static void main(String[] args) {

		int a = 0;
		int b = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = sc.nextInt();
        System.out.println(a + " "+b);
		for (int i = 2; i < n; i++)
        {
            int sum = a + b;
            System.out.print(" "+sum);
            a = b;
            b = sum;
        }
	}

}
