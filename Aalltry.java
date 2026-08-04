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
   /* 
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
    */
   /*
   Create an Animal class with a sound field. Create 3 different animal objects with different sounds and print them.
   //Create an Animal class with a sound field. Create 3 different animal objects with different sounds and print them.
class hello{
    String sound;
}
public class BAnimal1 {
    public static void main(String[] args) {
       hello dog = new hello();
       hello cat = new hello();
       hello cow = new hello();

       cow.sound = "maa";
       cat.sound = "miawoe";
       dog.sound = "bark";

       System.out.println("cow :"+cow.sound);
       System.out.println("cat :"+cat.sound);
       System.out.println("dog :"+dog.sound);
    }
}


   */

   
   //Constructor
   //{
  class Aalltry{
    int a;
    void hello(){
        a = 90;
        System.out.println(a);
    }
    public static void main(String[] args) {
        Aalltry obj = new Aalltry();
        obj.hello();
    }
  } 








//}