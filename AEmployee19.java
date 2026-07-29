public class AEmployee19 {
    double salary;

    double getSalary(){
        return salary;
    }
    public static void main(String[] args) {
        AEmployee19 obj = new AEmployee19();
        obj.salary = 51000;
        double sal = obj.getSalary();
        
        System.out.println("sal"+sal);

    }
}
