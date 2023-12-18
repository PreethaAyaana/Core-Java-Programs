package constructor;

public class RectangleThis {
	int l,b;
	public RectangleThis(int l,int b) {
		this.l = l;
		this.b = b;
	}
	public static void main(String[] args) {
		RectangleThis r1 = new RectangleThis(20, 10);
		System.out.println("Length of Rectangle: "+r1.l);
		System.out.println("Breadth of Rectangle: "+r1.b);
	}

}
