class A{
    static b obj = new b();
}
class b{
    void hello(){
        System.out.println("hello world");
    }
}
public class Demo {
    public static void main(String []args){
        A.obj.hello();
    }
}
