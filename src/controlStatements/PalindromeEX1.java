package controlStatements;

public class PalindromeEX1 {

	public static void main(String[] args) {
		String str = "MADAM";
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		String rev = sb.toString();
		System.out.println("String Reverse: "+sb);
		if (str.equals(rev))
		{
			System.out.println("String is Palindrome");
		}
		else
		{
			System.out.println("String is not Palindrome");
		}
		
		

	}

}
