
public class Areversesum4 {
    public static void main(String[] args) {
        hello obj = new hello();
        int a =obj.hi(541);
        System.out.println("The reverse of the number is: " + a);
    }
}
class hello
{
    int hi(int a){
        int number = a;
        int reverse = 0;
        int empty;
        while(number!=0){
            empty=number % 10;
            reverse = empty;
            System.out.print(reverse);
            number = number / 10;
        }
        int last = reverse;
        return last;
    }
}

