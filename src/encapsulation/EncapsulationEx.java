package encapsulation;
//Encapsulation : Wrapping Data in Single Unit
//Purpose - Data Hiding
	class Employee1{
		private int empID;
		private String name;
		private String Org = "CTS";
		//Read Only
		public String getOrg() {
			return Org;
		}
		public int getEmpID() {
			return empID;
		}
		public void setEmpID(int empID) {
			this.empID = empID;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Employee1(int empID, String name) {
			super();
			this.empID = empID;
			this.name = name;
		}
		public Employee1() {
		
		}
		
	}
public class EncapsulationEx {

	public static void main(String[] args) {
		Employee1 e = new Employee1();
		e.setEmpID(1);
		e.setName("Preetha");
		System.out.println("Emp_ID: "+e.getEmpID()+" Name: "+e.getName());

	}

}
