//mobile details
class AMobile004{
	String brand;
	String model;
	double price;
	void displayMobileDetails(){
		System.out.println("brand ="+brand);
		System.out.println("model ="+model);
		System.out.println("price ="+price);
		
	}
	public static void main(String[]args){
		AMobile004 obj1 = new AMobile004();
		obj1.brand = "Samsung";
		obj1.model = "51";
		obj1.price = 51111;
		AMobile004 obj2 = new AMobile004();
		obj2.brand = "apple";
		obj2.model = "51";
		obj2.price = 511100;
		obj1.displayMobileDetails();
		obj2.displayMobileDetails();
	}
}