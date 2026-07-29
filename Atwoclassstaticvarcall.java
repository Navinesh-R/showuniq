public class Atwoclassstaticvarcall {
    public static void main(String[] args) {
        hello obj = new hello();
        int b = hello.a;
        System.out.println(b);
    }
}
class hello{
    
    static int a = 20;
    
}
