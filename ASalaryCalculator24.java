public class ASalaryCalculator24 {
    double calculateTotalSalary(double basicSalary, double allowance){
        return basicSalary+allowance;
    }
    public static void main(String[] args) {
        ASalaryCalculator24 obj = new ASalaryCalculator24();
        double total = obj.calculateTotalSalary(15000, 5000);
        System.out.println("total ="+total);
    }
}
