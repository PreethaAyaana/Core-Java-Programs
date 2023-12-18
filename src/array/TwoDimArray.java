package array;

import java.util.Scanner;

public class TwoDimArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter Row size: ");
		int row = input.nextInt();
		System.out.println("Please enter Column size: ");
		int column = input.nextInt();
		int[][] arr = new int[row][column];
		System.out.println("Enter Array elements: ");
		for (int i = 0; i < arr.length; i++)
		{
			for(int j=0; j<arr.length; j++) {
				arr[i][j] = input.nextInt();
			}
			
		}
		
		System.out.println("Two Dimentional Array: ");
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println(" ");
		}


	}

}
