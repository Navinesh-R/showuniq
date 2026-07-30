//Create a Person class and a constructor that sets name and age at creation.
/* 
public class BPerson1 {
    public static void main(String[] args) {
        hi obj = new hi();
        obj.hello("Navinesh",24);
    }
}
class hi{
void hello(String name,int age){
    String a = name;
    int ab = age;
    System.out.println("Name :"+a);
    System.out.println("AGE :"+ab);
}
}
*/
class BPerson1{
    public static void main(String[] args) {
        hello obj = new hello("Navinesh",24);//constructor
        
    }
}
class hello{
 hello(String name,int age){
    System.out.println("name :"+name);
    System.out.println("age :"+age);
}
}