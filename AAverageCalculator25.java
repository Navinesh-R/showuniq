public class AAverageCalculator25 {
    double calculateAverage(int mark1, int mark2, int mark3){
        int total = mark1 + mark2 + mark3;
        return total/3.0;
    }
    public static void main(String[] args) {
        AAverageCalculator25 obj = new AAverageCalculator25();
        double average =obj.calculateAverage(35, 43, 38);
        System.out.println("a ="+average);

    }
}
