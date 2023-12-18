package functions;

class StaticMethod{
	static int division(int a, int b) {
		return a/b;
	}
}
public class FunctionDemo {
	
	int a=10; int b = 20;
	//Function without return type and without parameters
	void add() {
		System.out.println("Function without return type and without parameters");
		System.out.println("Addition: "+(a+b));
	}
	void addition(int num1,int num2) {
		System.out.println("Function without return type and with parameters");
		System.out.println("Addition: "+(num1+num2));
	}
	static String display() {
		return "Hello Preetha";
	}
	public static void main(String[] args) {
		FunctionDemo demo = new FunctionDemo();
		demo.add();
		demo.addition(11,22);
		System.out.println("Static String: "+display());
		//Creating object for another class to call division function
		System.out.println("");
	}

}
