//Create a Student class with fields name and rollNo. Create an object and print its details.
class BStudent1{
    int rollNo;
    String name;
    public static void main(String[] args) {
        BStudent1 obj = new BStudent1();
        obj.rollNo = 244;
        obj.name = "navinesh";
        System.out.println("Name :"+obj.name +" "+"Rollno :"+obj.rollNo);
    }

}