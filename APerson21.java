public class APerson21 {//return full name
    String firstName;
    String lastName;
    String getFullName(){
        return firstName +" "+ lastName;
    }
    public static void main(String[] args) {
        APerson21 obj = new APerson21();
        obj.firstName = "Navinesh";
        obj.lastName="Raja";
        String fname = obj.getFullName();
        System.out.println("fname"+fname);
    }
}
