package decisionMakingStatements;

import java.util.Scanner;

public class ArmstrongNumberUsingWhile {

	public static void main(String[] args) {

		int num, sum = 0, temp,rem;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		num = sc.nextInt();
		temp = num;
		while (temp != 0) {
			rem = temp % 10;
			sum += Math.pow(rem , 3);
			temp /= 10;
		}
		if(sum == num) {
			System.out.println(num +" is an Armstrong number");
		}
		else
		{
			System.out.println(num +" is not an Armstrong number");
		}
	
		

	}

}
