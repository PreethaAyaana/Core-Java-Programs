package array;

import java.util.Scanner;

public class StudentScoreCard1D {

	public static void main(String[] args) {
		int sum = 0;
		float percentage;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Subjects Count to Calulate Total Marks and Percentage: ");
		int size = sc.nextInt();
		int[] totalMarks = new int[size];
		System.out.println("Enter the Marks: ");
		for(int i=0; i<totalMarks.length; i++) {
			totalMarks[i] = sc.nextInt();
		}
		System.out.println("Marks Scored: ");
		for(int i=0; i<totalMarks.length; i++) {
			System.out.print(totalMarks[i]+" ");
			sum += totalMarks[i];
		}
		System.out.println();
		System.out.println("Total Marks : "+sum);
		float sum1 = (float) sum;
		float size1 = (float) size;
		percentage = (sum1*100)/ size1;
		System.out.println("Percentage: "+percentage+"%");

	}

}
