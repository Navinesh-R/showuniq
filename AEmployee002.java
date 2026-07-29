//Employee Details
class AEmployee002{
	int employeeId;
	String employeeName;
	String department;
	double salary;
	void displayEmployee()
	{
		System.out.println("employeeId = " +employeeId);
		System.out.println("employeeName = "+employeeName);
		System.out.println("department = "+department);
		System.out.println("salary = "+salary);
	}
	public static void main(String []args){
		AEmployee002 obj1 = new AEmployee002();
		obj1.employeeId = 20244;
		obj1.employeeName = "Navinesh";
		obj1.department="Java";
		obj1.salary=51000;
		AEmployee002 obj2 = new AEmployee002();
		obj2.employeeId = 20245;
		obj2.employeeName = "Navin";
		obj2.department="Javascript";
		obj2.salary=151000;
		obj1.displayEmployee();
		System.out.println("________________");
		obj2.displayEmployee();
	}
}
		