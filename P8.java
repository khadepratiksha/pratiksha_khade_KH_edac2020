package Assignment3;

import java.util.Scanner;

public class P8 {

	public static void main(String[] args) {

		int sum = 0, a, temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = sc.nextInt();
		temp = n;
		while (n > 0) {
			a = n % 10;
			sum = sum + (a * a * a);
			n = n / 10;
		}
		if (temp == sum)
			System.out.println(n +" is armstrong number");
		else
			System.out.println(n +" is Not a armstrong number");
	}

}
