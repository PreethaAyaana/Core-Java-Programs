package operatorsinjava;

import java.util.Scanner;

public class TernaryOperator3Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 Numbers");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int max;

		max = (num1 > num2 && num1 > num3) ? (num1) : (num2 > num3) ? (num2) : (num3);
		System.out.println("The max of 3 Num is : " + max);
	}

}
