package Patterns;

class Printmethod{
	static void printPattern(int n) {
		int i, j;
		for (i = 1; i <= n; i++) {
			for (j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (j = 1; j <= i; j++) {
				//System.out.print(i + " ");
				System.out.print("* ");
				//System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}

class PrintmethodRev{
	static void printPattern(int n) {
		int i, j;
		for (i = 10; i <= 1; i--) {
			for (j = 10; j >= n - i; j--)
				System.out.print(" ");
			}
			for (j = 1; j <= i; j++) {
				//System.out.print(i + " ");
				System.out.print("* ");
				//System.out.print(j + " ");
			}
			System.out.println();
		}
	}

public class ChristmasTree {

	public static void main(String[] args) {
		Printmethod.printPattern(15);
		PrintmethodRev.printPattern(10);
	}

}
