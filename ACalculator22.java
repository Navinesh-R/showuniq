public class ACalculator22 {
    
    int add(int number1, int number2){

        return number1 + number2;
    }
    public static void main(String[] args) {
        ACalculator22 obj = new ACalculator22();
        int result = obj.add(13,5);
        System.out.println("result "+result);
    }
}
