package Patterns;

public class NumbersLeftTrianglePattern {

	public static void main(String[] args) {
		int num = 1;
		for(int i=1;i<=5;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
	}

}
