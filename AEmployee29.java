public class AEmployee29 {
    int employeeId;
    String employeeName;
    static String companyName = "UNIQ Technologies";

    void displayEmployee() {
        System.out.println("employeeId ="+employeeId);
        System.out.println("employeeName ="+employeeName);
        System.out.println("companyName ="+companyName);
    }

    public static void main(String[] args) {
        AEmployee29 obj = new AEmployee29();
        obj.employeeId = 20244;
        obj.employeeName = "Navinesh";
        companyName = "uniq technologies";
        AEmployee29 obj1 = new AEmployee29();
         obj1.employeeId = 20245;
        obj1.employeeName = "Navinesh raja";
        companyName = "zoho";

        obj.displayEmployee();
        obj1.displayEmployee();
    }

}
