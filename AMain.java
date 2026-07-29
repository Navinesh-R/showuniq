class SystemClass{
    static PublicStream ref = new PublicStream();
}
class PublicStream{
    void display(){
        System.out.println("he is a developer");
    }
}
public class AMain {
    public static void main(String[] args) {
        SystemClass.ref.display(); 
    }
}
