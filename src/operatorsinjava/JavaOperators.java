package operatorsinjava;

public class JavaOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 11;
		int num2 = 10;
		
		//Arithmetic operator
		int add = num1+num2;
		int sub = num1-num2;
		int mul = num1*num2;
		int quot = num1/num2;
		int rem = num1%num2;
		System.out.println("ARITHMETIC OPERATORS");
		System.out.println(add);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(quot);
		System.out.println(rem);
		
		//Relational operator
		if(num1 > num2)
		{
			System.out.println("Num1 is greater than Num2");
		}
		if(num1 < num2)
		{
			System.out.println("Num1 is less than Num2");
		}
		if(num1 == num2)
		{
			System.out.println("Num1 is equal to Num2");
		}
		
		//Bitwise operator
		System.out.println("BITWISE OPERATOR");
		System.out.println(num1&num2);
		System.out.println(num1|num2);
		System.out.println(num1^num2);
		System.out.println(~num2);
		
		//Unary operator
		int x=100;
		System.out.println(x++);
		System.out.println(x--);
		System.out.println(++x);
		System.out.println(--x);
	}

}
