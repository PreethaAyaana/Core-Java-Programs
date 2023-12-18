package String;

public class wordOcc {

	public static void main(String[] args) {
		String str = "    Hello Everyone I am here and I am fine    ";

		str = str.trim();
		String[] words = str.split("\\s+");

		System.out.println("Original string: " + str);

		String[] uniqueWords = new String[words.length];
		int[] wordOcc = new int[words.length];

		int uniqueCount = 0;

		for (String word : words) {
			int index = -1;

			// Check if the word is already present 
			for (int i = 0; i < uniqueCount; i++) {
				if (uniqueWords[i].equals(word)) {
					index = i;
					break;
				}
			}

			if (index != -1) {
				
				wordOcc[index]++;
			} else {
				
				uniqueWords[uniqueCount] = word;
				wordOcc[uniqueCount] = 1;
				uniqueCount++;
			}
		}

		for (int i = 0; i < uniqueCount; i++) {
			if(wordOcc[i] > 1) {
			System.out.println( uniqueWords[i] + "----- Occurrences: " + wordOcc[i]);
			}
		}
	}
}
