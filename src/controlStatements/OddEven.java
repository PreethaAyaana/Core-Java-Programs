package controlStatements;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER A NUMBER");
		int num = sc.nextInt();
		
		if(num%2 == 0) {
			System.out.println("It is EVEN number");
		}
		else if(num%2 == 1) {
			System.out.println("It is ODD number");
		}
		else
		{
			System.out.println("INVALID");
		}
	}

}
