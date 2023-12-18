package String;

public class StringBuilderEx {

	public static void main(String[] args) {
		StringBuilder build = new StringBuilder("Hello Welcome");
		System.out.println("String Builder");
		System.out.println("Str Append :"+build.append(" Preetha"));
		StringBuilder sb = new StringBuilder();
		System.out.println("Default Capacity :"+sb.capacity());
		System.out.println("Str Capacity :"+build.capacity());
		System.out.println("Str Code Point At :"+build.codePointAt(5));
		System.out.println("Str Code Point Before :"+build.codePointBefore(2));
		System.out.println("Str HashCode :"+build.hashCode());
		
	}

}
