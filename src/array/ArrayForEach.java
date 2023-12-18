package array;

public class ArrayForEach {

	public static void main(String[] args) {
		String str[]= {"Preetha","Roshni","Nandhini"};
		for(int i=0;i<str.length;i++) {
			System.out.print(str[i]+" ");
		}
		System.out.println();
		for(String str1:str) {
			System.out.println(str1);
		}

	}

}
