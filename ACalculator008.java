class ACalculator008{
	int number1;
	int number2;
	void addition()
	{
		System.out.println("addition ="+(number1+number2));
	}
	void subtraction()
	{
		System.out.println("subtraction ="+(number1-number2));
	}
	void multiplication()
	{
		System.out.println("multiplication ="+(number1*number2));
	}
	public static void main(String[]args){
		ACalculator008 obj1 = new ACalculator008();
		obj1.number1 = 10;
		obj1.number2 = 40;
		obj1.addition();
		obj1.subtraction();
		obj1.multiplication();
	}
}