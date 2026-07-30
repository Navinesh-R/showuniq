//Create a Point class with x and y. Write a method to print coordinates as (x, y).
class hello{
    void hi(int x,int y){
        System.out.println("("+x+","+y+")");
    }
}

public class BPoint1 {
    public static void main(String[] args) {
        hello obj = new hello();
        obj.hi(2,3);
    }
}
