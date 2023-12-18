package abstractinjava;

abstract class Fruit      //Abstract Class - Can't be instantiated but can be sub classed
{    
	abstract void display();  //Abstract Method - Not compulsory to have abstract method in every abstract class 
}
class Mango extends Fruit{
	
	@Override
	void display() {
		System.out.println("Mango");
	}

	static void Type() {  //Concrete Method/Non Abstract method
		System.out.println("Banganapali");
	}
}
class Watermelon extends Fruit{

	@Override
	void display() {
		System.out.println("Watermelon");
		
	}
}

public class AbstractClassMethod {

	public static void main(String[] args) {
		Fruit f = new Mango();  //Up casting
		f.display();
		Mango m = new Mango();  
		Fruit fref; //object can be created for abstract class ONLY THROUGH REFERENCE 		
		fref = m;
		fref.display();
		Mango m1 = new Mango();  //Object creation for Sub Class
		m1.Type();
		Watermelon w = new Watermelon();
		w.display();
		
	}

}
