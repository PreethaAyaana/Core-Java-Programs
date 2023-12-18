package assessment1;

import java.util.Scanner;

public class InAmsterdam {
	public int countAm(String s) {
		int count = 0;
		String str = s.toLowerCase();
		String a[]= str.split(" ");
		for(int i = 0; i<a.length; i++) {
			if(a[i].equals("am")) {
				count += count;
			}
		}
		
		return count;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		InAmsterdam obj = new InAmsterdam();
		System.out.println(obj.countAm(s)); 
		
	}
	

}
