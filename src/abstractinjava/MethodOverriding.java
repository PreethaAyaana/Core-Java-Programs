package abstractinjava;

abstract class Math{
	 void display(int num1,int num2) {
		System.out.println("Add: "+(num1+num2));
	}
}
class Add extends Math{

	@Override
	void display(int num1, int num2) {
		super.display(num1, num2);
	}
	
}

public class MethodOverriding {

	public static void main(String[] args) {
		Math a = new Add();
		a.display(10, 20);
	}

}
