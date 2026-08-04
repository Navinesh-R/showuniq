class Different{
	int a;
	int b;
	int add;
	int multi;
	int different;
	void call(){
		a = 10;
		b = 20;
		add = a + b;
		multi = a * b;
		different = a - b;
		System.out.println("different = "+different);
	}
	public static void main(String[] args){
		Different obj1 = new Different();
		obj1.call();
	}
}