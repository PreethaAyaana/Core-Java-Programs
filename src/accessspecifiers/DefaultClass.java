package accessspecifiers;

class Defaultcls{
	int a;
	Defaultcls(int a) {
		this.a=a;
	}
	void display() {
		System.out.println("Value of a:"+a);
	}
	
}
class DefaultSub extends Defaultcls{
	int b;
	DefaultSub(int a,int b) {
		super(a);//default class parent constructor
		this.b=b;	
	}
	void defSubMethod() {
		display();//default class default method
		System.out.println("Value of b:"+this.b);
	}
	
}
public class DefaultClass {

	public static void main(String[] args) {
		Defaultcls dc=new Defaultcls(20);//non sub class
		dc.display();
		System.out.println("*************Sub class**********");
		DefaultSub ds=new DefaultSub(12,23);
		ds.defSubMethod();

	}

}
