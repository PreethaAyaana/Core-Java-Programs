package array;

public class ArrayEx2 {

	public static void main(String[] args) {
		int[][] sample = {
				{1, 2, 3},
				{4, 5, 6}
				};
				for(int x=0; x<sample.length; x++) {
				  for(int y=0; y<sample[x].length; y++) {
				    System.out.println(sample[x][y]);
				  }
				}
	}

}
