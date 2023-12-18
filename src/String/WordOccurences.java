package String;

public class WordOccurences {
	
	public int countAm(String s) {
		String str = s.toLowerCase();
		System.out.println("str :"+str);
		int cnt = 0;
		String a[] = str.split(" ");
		for (int i = 0; i < a.length; i++) {
			if (a[i].equals("am")) {
				cnt = cnt + 1;
				
			}
			
			//System.out.println(i+"--"+a[i]);
		
		}
		return cnt;
	}
	

	public static void main(String[] args) {
		
		WordOccurences obj = new WordOccurences();
		obj.countAm("I am in Amsterdam am I");
		
		
//String str = "    Hello Everyone I am fine    ";
		
		//str = str.trim();

//	        String[] words = str.split("\\s+");
//		String[] words = str.split(" ");
//		for(int i=0; i<words.length; i++) {
//			System.out.println(i+"---"+words[i]);
		
		
		}
		//int wordCount = words.length;
		//System.out.println("Number of words: " + wordCount);
		
		
		

	}


