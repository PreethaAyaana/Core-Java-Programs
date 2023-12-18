package controlStatements;

import java.util.Scanner;

public class SwitchCaseOperations {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter two numbers :");
		int num1 = ip.nextInt();
		int num2 = ip.nextInt();
		System.out.println("Enter any Operator + _ * / to perform calculation");
		char operator = ip.next().charAt(0);
		
		switch(operator) 
		{
		case '+':
			System.out.println("Addition of two numbers: "+(num1+num2));
			break;
		case '-':
			System.out.println("Subraction of two numbers: "+(num1-num2));
			break;
		case '*':
			System.out.println("Multiplication of two numbers: "+(num1*num2));
			break;
		case '/':
			System.out.println("Quotient of two numbers: "+(num1/num2));
			break;
		case '%':
			System.out.println("Remainder of two numbers: "+(num1%num2));
			break;
		
		}
		
		
		

	}

}
