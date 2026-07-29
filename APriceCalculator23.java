public class APriceCalculator23 {
    double calculateTotal(double price, int quantity){

        return price + quantity;
    }
    public static void main(String[] args) {
        APriceCalculator23 obj = new APriceCalculator23();

        double hello = obj.calculateTotal(15, 4);
        System.out.println("hello "+hello);
    }
}
