package Assignment3;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		System.out.print("enter rows and columns");
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		int m[][] = new int[row][col];
		System.out.println("enter matrix");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				m[i][j] = sc.nextInt();
			}
		}
		System.out.print("enter rows and columns");
		int r = sc.nextInt();
		int c = sc.nextInt();
		if (r != col) {
			System.out.println("matrix cant be multiplied");
		}
		System.out.println();
		int n[][] = new int[r][c];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				n[i][j] = sc.nextInt();
			}

		}
//		int sum=0;
		int z[][] = new int[row][c];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < c; j++) {
				for (int k = 0; k < c; k++) {
					z[i][j] = z[i][j] + m[k][i] * n[j][k];
				}

			}

		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(z[i][j] + " ");
			}
			System.out.println();
		}

	}

}
