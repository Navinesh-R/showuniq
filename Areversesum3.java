public class Areversesum3 {
    public static void main(String[] args) {
        hello obj = new hello();
        obj.hi(541);
    }
}
class hello
{
    void hi(int a){
        int number = a;
        int reverse;
        int empty;
        while(number!=0){
            empty=number % 10;
            reverse = empty;
            System.out.print(reverse);
            number = number / 10;
        }
    }
}

