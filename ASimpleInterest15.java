public class ASimpleInterest15 {
    void calculateInterest(double principal,double rate,double time){
        double SimpleInterest = principal * rate * time / 100;
        System.out.println("SimpleInterest ="+SimpleInterest);
    }
    public static void main(String[] args) {
        ASimpleInterest15 obj = new ASimpleInterest15();
        obj.calculateInterest(10000,5,2);
    }
}
