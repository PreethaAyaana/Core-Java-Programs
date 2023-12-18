package array;

import java.util.Scanner;

public class SortArrWithoutTemp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter size of array: ");
		int size = input.nextInt();
		int[] arr = new int[size];
		int[] sortedarr = new int[size];
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
			int k=0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					k++;
				}
			}
			sortedarr[k] = arr[i];
		}
		for(int k=0; k<arr.length; k++) {
			System.out.print(sortedarr[k]+" ");
		}
	}

}
