//product details
class AProduct003
{
	int productId;
	String productName;
	double price;
	void showProduct(){
		System.out.println("productId = "+productId);
		System.out.println("productName ="+productName);
		System.out.println("price ="+price);
	}
	public static void main(String []args){
		AProduct003 obj1 = new AProduct003();
		obj1.productId=142;
		obj1.productName="apple";
		obj1.price= 50;
		AProduct003 obj2 =new AProduct003();
		obj2.productId=1423;
		obj2.productName="orange";
		obj2.price= 150;
		AProduct003 obj3 = new AProduct003();
		obj3.productId=1421;
		obj3.productName="banana";
		obj3.price= 350;
		obj1.showProduct();
		System.out.println("------------------------------");
		obj2.showProduct();
		System.out.println("------------------------------");
		obj3.showProduct();
		System.out.println("------------------------------");
	}
}