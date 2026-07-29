class AStudent001{//student details
	int studentId;
	String studentName;
	String cource;
	void displayStudentDetails()
	{
		System.out.println(studentId);
		System.out.println(studentName);
		System.out.println(cource);
	}
	public static void main(String[]args)
	{
		AStudent001 obj1 = new AStudent001();
		obj1.studentId = 20244;
		obj1.studentName = "navinesh";
		obj1.cource = "java";
		obj1.displayStudentDetails();
		
	}
}