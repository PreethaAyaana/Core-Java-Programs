package String;

public class StringBufferEx {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("Hello");
		sb.append(" Preetha");
		System.out.println("String Buffer Append :"+sb);
		
		StringBuffer sb1 = new StringBuffer("JAVA"); 
		StringBuffer sb2 = new StringBuffer("JAVA");
		System.out.println(sb1.equals(sb2));  //
		System.out.println(sb1.hashCode());
		System.out.println(sb2.hashCode());
		
		
	}
}
