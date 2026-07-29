public class AEmployeeInfo13 {
    void displayEmployee(int id,String name,double salary)
    {
        System.out.println(id);
        System.out.println(name);
        System.out.println(salary);
    }
    public static void main(String[] args) {
        AEmployeeInfo13 obj = new AEmployeeInfo13();

        obj.displayEmployee(20244,"navinesh", 20000);
    }
}
