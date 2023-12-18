package decisionMakingStatements;

import java.util.Scanner;

public class SumOfDigitsOfANumber {

	public static void main(String[] args) {
		int num,sum=0,temp; 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		num = sc.nextInt();
		temp = num;
		while(num!=0) {
			temp = num%10;
			sum += temp;
			num /= 10;
		}
		System.out.println("Sum Of Digits: "+sum);
		

	}

}
