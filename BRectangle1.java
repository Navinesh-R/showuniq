//Create a Rectangle class with length and width, and methods for area and perimeter.

public class BRectangle1 {
    double length = 15;
    double width = 8;

    public static void main(String[] args) {
        BRectangle1 obj = new BRectangle1();
        obj.area();
        obj.perimeter();
    }

    void area() {
        System.out.println("area :" + (length + width));
    }

    void perimeter() {
        System.out.println("perimeter: " + (2 * (length + width)));
    }
}
