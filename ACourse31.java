public class ACourse31 {
    int courseId;
    String courceName;
    double courseFee;
    static String instituteName;

    void setCourceDetails(int id, String name, double fee) {
        courseId = id;
        courceName = name;
        courseFee = fee;
    }

    void displayCourceDetails() {
        System.out.println("courceId ="+courseId);
        System.out.println("courceName ="+courceName);
        System.out.println("courseFee ="+courseFee);
        System.out.println("instituteName ="+instituteName);
    }

    double getCourceFee() {
        System.out.println("courseFee = "+courseFee);
       
    }
    public static void main(String[] args) {
        ACourse31 obj = new ACourse31();
        obj.setCourceDetails(20244,"uniq", 30000);
        obj.displayCourceDetails();
        obj.getCourceFee();
        ACourse31 obj1 = new ACourse31();
        obj1.setCourceDetails(20245,"uniq", 35000);
        obj1.displayCourceDetails();
        obj1.getCourceFee();
    }
}
