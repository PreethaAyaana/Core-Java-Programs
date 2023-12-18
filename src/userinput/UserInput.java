package userinput;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your full name: ");
		String name = sc.nextLine();
		
//		System.out.println("Enter your Age: ");
//		int age = sc.nextInt();
//		
//		System.out.println("Enter your Percentage: ");
//		float percentage = sc.nextFloat();
//		
//		System.out.println("Full Name :"+name);
//		System.out.println("Age :"+age);
//		System.out.println("Percentage :"+percentage);
		
		System.out.println("First Char of Name: ");
		char ch = name.charAt(0);
		System.out.println(ch);
		

	}

}
