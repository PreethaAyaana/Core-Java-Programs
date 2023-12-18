package array;

import java.util.Scanner;

public class OneDimArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter size of array: ");
		int size = input.nextInt();
		int[] numbers = new int[size];
		System.out.println("Enter Array elements: ");
		for (int i = 0; i < numbers.length; i++)
		{
			numbers[i] = input.nextInt();
		}
		
		System.out.println("One Dimentional Array: ");
		for(int i=0; i<numbers.length; i++) {
			System.out.print(numbers[i]+" ");
		}

}
}