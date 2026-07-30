/*public class Areversesum2 {
    int hello() {
        int a = 5417;
        int b;
        int c = 0;
        int reverse;
        while (a != 0) {
            b = a % 10;
            reverse = b;
            System.out.print(reverse);
            a = a / 10;
            
        }
        
    

    public static void main(String[] args) {
        Areversesum2 obj = new Areversesum2();
        obj.hello();
    }
}
*/
public class Areversesum2{
    public static void main(String[]args){
        hello obj = new hello();
        obj.hi();
    }
}
class hello{
    void hi(){
        int number = 541;
        int reverse;
        int empty;
        while(number!=0){
            empty = number % 10;
            reverse = empty;
            System.out.println(reverse);
            number = number / 10;
        }
    }
}