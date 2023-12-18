package array;

import java.util.Scanner;

public class ArrayForEachScanner {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = input.nextInt();
		String[] arr = new String[size];
		System.out.println("Please enter names");
		for(int i=0;i<size;i++) {
			arr[i] = input.nextLine();
			System.out.print(arr[i]+" ");
		}
//		System.out.println();
//		for(String str1:arr) {
//			System.out.println(str1);
//		}
	}
}
