package array;

import java.util.Arrays;

public class StrArraySortMethod {

	public static void main(String[] args) {
		String name[] = {"Preetha","Sunitha","Abi","Deepi","Lakshmi","Selvan"};
		System.out.println("Given String: ");
		for(int i=0; i<name.length; i++) {
			System.out.print(name[i]+" ");
		}
		Arrays.sort(name);
		System.out.println();
		System.out.println("Sorted String: ");
		for(int i=0; i<name.length; i++) {
			System.out.print(name[i]+" ");
		}

	}

}
