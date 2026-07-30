//Create a Circle class with radius and a method to calculate area.
public class BCircle1 {//circule calculation
    double radius;
    void calculateArea()
    {
        System.out.println("calculateArea :"+ (3.14 * radius * radius));
    }
    
    public static void main(String[] args) {
        BCircle1 obj = new BCircle1();
        obj.radius = 5;
        obj.calculateArea();
        
    }
}


