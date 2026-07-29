public class Arectangle009{//rectangle calculation
 double length;
 double width;
 
 void calculateArea(){
    System.out.println("CalculateArea :"+(length * width));
 }
 void calculatePerimeter()
 {

    System.out.println("CalculateArea :"+(2 * (length + width)));
 }
 public static void main(String[] args) {
    
    Arectangle009 obj = new Arectangle009();
    obj.length=20;
    obj.width=15;
    obj.calculateArea();
    obj.calculatePerimeter();
 }
}