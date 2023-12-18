package constructor;

public class Rectangle {
	int l=10,b;
	public Rectangle(int l,int b) {
		l = l;   //Ambiguity - Compiler prints default values of instance variable
		b = b;
	}
	public static void main(String[] args) {
		Rectangle r = new Rectangle(20, 10);
		System.out.println("Length of Rectangle: "+r.l);
		System.out.println("Breadth of Rectangle: "+r.b);
	}

}
