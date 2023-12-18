package constructor;

class Student1 {
	int eno;
	String name;

	// No return even void-->not static
	Student1() {
		eno = 1;
		name = "Preetha";
		System.out.println("Default Constructor");
		System.out.println("Eno : " + eno + "  Name : " + name);
	}

	Student1(int eno, String nm) {
		this.eno = eno;
		name = nm;
		System.out.println("Parameterized Constructor");
		System.out.println("Eno : " + this.eno + "  Name : " + name);
	}
}

public class ConstructorEx {

	public static void main(String[] args) {
		Student1 s = new Student1();
		System.out.println("********************");
		Student1 s1 = new Student1(16, "Sunitha");
	}
}
