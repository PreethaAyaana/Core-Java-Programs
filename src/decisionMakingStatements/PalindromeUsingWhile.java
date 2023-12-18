package decisionMakingStatements;

public class PalindromeUsingWhile {

	public static void main(String[] args) {
		int num = 15;
		
		int rev = 0;
		int temp=num;
		while(num!=0) {
			int n = num%10;
			rev = (rev*10)+n;
			num /= 10;
		}
		//System.out.println();
		if(temp == rev) {
			System.out.println("PALINDROME");
		
		}
		else
		{
			System.out.println("NOT A PALINDROME");
		}

	}

}
