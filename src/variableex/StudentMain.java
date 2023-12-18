package variableex;

class StudentMark{
	static int mathMark = 95;
	void display()
	{
		System.out.println("Math Mark : "+mathMark);
	}
}
public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentMark s = new StudentMark();
		s.display();
	}

}
