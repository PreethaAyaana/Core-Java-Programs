package oops;

//class Parent{
//	final void display() {
//		System.out.println("Parent Class");
//	}
//}
class Parent{
	void display() {
		System.out.println("Parent Class");
	}
}

// public class Child extends Parent{  //Class declared as final can not extends
//	 final int num = 10;  //we can not change value
//	void display() {
//		//we can not override final method
//	}
//}
class Child extends Parent{  //Class declared as final can not extends
	 int num = 10;  //we can not change value
	void display() {
		System.out.println("Child Class");
		System.out.println(num);
	}
}
public class FinalKeyword {

	public static void main(String[] args) {
		Child c = new Child();
		c.num=20; //we can not change value of final variable
		Parent p = new Child();
		p.display();
	}
}