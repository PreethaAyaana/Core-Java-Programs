package String;

public class StringMethods {

	public static void main(String[] args) {
		String str1 = "HELLO";
		String str2 = "hello";
		//String Methods in Java
		System.out.println("Concatenation : "+str1.concat(str2));
		System.out.println("Length : "+str1.length());
		System.out.println("Uppercase : "+str1.toUpperCase());
		System.out.println("Lowercase : "+str1.toLowerCase());
		System.out.println("Equal : "+str1.equals(str2));
		System.out.println("Equal Ignore Case : "+str1.equalsIgnoreCase(str2));
		System.out.println("Code Point At : "+str1.codePointAt(0));
		System.out.println("Char At method : "+str1.charAt(0));
		System.out.println("Code Point Before : "+str2.codePointAt(1));
		System.out.println("Compare :"+str1.compareTo(str2.toUpperCase()));
		System.out.println("Compare :"+str1.compareTo(str2));
		System.out.println("Compare Ignore Case :"+str1.compareToIgnoreCase(str2));
		
		//Intern Method
		String s=new String("hi");
		String s1=new String("hi");
		System.out.println("String  :"+(s==s1));
		s=s.intern();
		s1=s1.intern();  
		System.out.println("String Intern :"+(s==s1));
		
		
		
	}

}
