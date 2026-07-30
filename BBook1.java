//Create a Book class with title, author, price. Create 2 books and print the cheaper one.
public class BBook1 {
    String title;
    String author;
    int price;
    public static void main(String[] args) {
        Hello obj1 = new Hello();
        obj1.hi();
    }
}
class Hello{
    void hi(){
       
        
        BBook1 obj1 = new BBook1();
        obj1.title = "Harry Potter";
        obj1.author = "Hari";
        obj1.price = 5093;
        BBook1 obj2 = new BBook1();
        obj2.title = "Spyderman";
        obj2.author = "Arun";
        obj2.price = 1509;
        if(obj1.price < obj2.price){
            System.out.println("Title :"+obj1.title);
            System.out.println("Author :"+obj1.author);
            System.out.println("Price :"+obj1.price);
        }
        else if(obj1.price > obj2.price){
            System.out.println("Title :"+obj2.title);
            System.out.println("Author :"+obj2.author);
            System.out.println("Price :"+obj2.price);
        }


    }
}

