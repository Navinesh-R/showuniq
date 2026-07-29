/*
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



*/
/* 
public class A { // Like System Class
    static A out;

    public static void main(String[] args) {
        out = new B();
        out.println();
    }//System.out.println()
}// System out = new PrintStream()

class B { // Like PrintStream Class
    void println() {
        System.out.print("Hello");
    }
}
*/
/* 
class Aalltry{
    public static void main(String[]args){
        emp obj = new emp();
        int b = emp.a;
        System.out.println(b);
    }
}
class emp{
    static int a = 10;
}
    */
   /* 
   class SystemClass {
    PublicStream ref = new PublicStream();   // Instance object
}

class PublicStream {
    void display() {
        System.out.println("He is a developer");
    }
}

public class AMain {
    public static void main(String[] args) {

        // Create object of SystemClass
        SystemClass obj = new SystemClass();

        // Access PublicStream object through SystemClass object
        obj.ref.display();
    }
}
    */
class Aalltry{
    public static void main(String[]args){
        int a = 123;
        int b ;
        int c = 0;
        while(a != 0){
        b = a % 10;
        c = c * 10 + b;
        }
    }
}