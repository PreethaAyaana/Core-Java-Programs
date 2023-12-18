package HashTable;


import java.util.Hashtable;

public class HashTable {

	public static void main(String[] args) {
		Hashtable<Integer ,String> ht = new Hashtable<>();
		ht.put(1, "C");
		ht.put(2, "C++");
		ht.put(3, "C#");
		ht.put(4, "Java");
		ht.put(5, "Python");
		System.out.println(ht);
		//To retrieve a key value
		String s = ht.get("Java");
		if(s != null) {
			System.out.println("Java = "+ s);
		}
	}

}
