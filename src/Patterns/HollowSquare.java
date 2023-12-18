package Patterns;

import java.util.Scanner;

public class HollowSquare {
	static void patternPrint(int n) {
		int i, j;
		for(i=1;i<=n;i++) {
			for(j=1;j<=n;j++) {
				if(i == 1 || j == 1 || i == n || j == n ) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to form Hollow Square");
		int n = sc.nextInt();
		patternPrint(n);

	}

}
