public class AProductBill14 {
    void calculateBill(String productName,double price,int quantity){
        System.out.println("total = "+ (price * quantity));
    }
    public static void main(String[] args) {
        AProductBill14 obj = new AProductBill14();
        obj.calculateBill("banana", 20, 12);
    }
}
