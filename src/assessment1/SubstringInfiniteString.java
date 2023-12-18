package assessment1;

import java.util.Scanner;

public class SubstringInfiniteString {
	
	static void findSubstring(String infStr, String toFind) {
        if ((infStr + infStr).contains(toFind)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int i = 0; i < T; i++) {
            String infStr = scanner.next();
            String toFind = scanner.next();
            findSubstring(infStr, toFind);
        }
    }
}
