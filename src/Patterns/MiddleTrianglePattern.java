package Patterns;

public class MiddleTrianglePattern {
	void printT(int n) {
		for (int i = 1; i < n; i++) {// rows
			for (int j = 1; j <= i; j++) {// col
				//System.out.print("* ");
				//System.out.print(i+" ");
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		MiddleTrianglePattern p=new MiddleTrianglePattern();	
		p.printT(3);
		p.printT(5);
		p.printT(3);
	}	

	}
