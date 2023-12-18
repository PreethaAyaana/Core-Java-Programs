package interfaceinjava;

interface Father{
	int dadAmt = 123;
	void msg();
}
interface Mother{
	int momAmt = 456;
	void msg();
}
class Child implements Father,Mother{

	@Override
	public void msg() {
		System.out.println("Total Amount from Mom and Dad: "+(dadAmt+momAmt));
	}
	
}
public class InterfaceEX1 {

	public static void main(String[] args) {
		Child c = new Child();
		c.msg();
	}

}
