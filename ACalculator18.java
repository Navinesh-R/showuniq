public class ACalculator18 {
    //return addition result
    int number1;
    int number2;
    int getAddition(){

        return number1 + number2;
    }
    public static void main(String[] args) {
        ACalculator18 obj = new ACalculator18();
            obj.number1 = 10;
            obj.number2 = 35;
            int number = obj.getAddition();
            System.out.println("number"+number);
    }
}
