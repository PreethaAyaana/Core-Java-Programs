package array;

import java.util.Scanner;

public class ArraySortTemp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter size of array: ");
		int size = input.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter Array elements: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = input.nextInt();
		}
		System.out.println("Given Array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("-------Sorted array--------");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int tmp = 0;
				if (arr[i] > arr[j]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
			System.out.print(arr[i]+" "); //Sorted Array
		}	
	}
}