public class ACircle10 {//circule calculation
    double radius;
    void calculateArea()
    {
        System.out.println("calculateArea :"+ (3.14 * radius * radius));
    }
    void calculateCircumference()
    {
        System.out.println("calculateCircumference :"+ (2 * 3.14 * radius));
    }
    public static void main(String[] args) {
        ACircle10 obj = new ACircle10();
        obj.radius = 5;
        obj.calculateArea();
        obj.calculateCircumference();
    }
}
