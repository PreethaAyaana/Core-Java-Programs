package controlStatements;

import java.util.Scanner;

public class StudentMarksAvg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your English Mark :");
		int engMark = sc.nextInt();
		System.out.println("Enter your Maths Mark :");
		int mathMark = sc.nextInt();
		System.out.println("Enter your Science Mark :");
		int scienceMark = sc.nextInt();

		int avg = (engMark+mathMark+scienceMark)/3;
		
		System.out.println("Grade Scored:");
		
		if(avg >= 90 && avg <= 100)
		{
			System.out.println("O+");
		}
		else if(avg >= 75 && avg < 90)
		{
			System.out.println("A");
		}
		else if(avg >= 60 && avg < 75)
		{
			System.out.println("A+");
		}
		else if(avg >= 50 && avg < 60)
		{
			System.out.println("B");
		}
		else if(avg >= 35 && avg < 50)
		{
			System.out.println("B+");
		}
		else if(avg >= 0 && avg < 35)
		{
			System.out.println("F");
		}
		else {
			System.out.println("INVALID MARKS");
		}
	}

}
