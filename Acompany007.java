class Acompany007{
	String companyName;
	String location;
	void displayCompanyName(){
		System.out.println("companyName ="+companyName);
	}
	void displayLocation(){
		System.out.println("location ="+location);
	}
	public static void main(String[]args){
		Acompany007 obj1 = new Acompany007();
		obj1.companyName = "zoho";
		Acompany007 obj2 = new Acompany007();
		obj2.location = "chennai";
		obj1.displayCompanyName();
		obj2.displayLocation();
	}
	//company information
}