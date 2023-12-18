package HashTable;

import java.util.HashMap;

public class HashMapForEach {

	public static void main(String[] args) {
		HashMap<String, Integer> Course = new HashMap<>();

		Course.put("Java", 2000);
		Course.put("Testing Automation", 1500);
		Course.put("Python", 2500);
		System.out.println("Course Price: " + Course);

		System.out.print("Discount Sale Price: ");
		Course.forEach((key, value) -> {
			value -= value * 15 / 100;
			System.out.print(key + "=" + value + " ");
		});

	}

}
