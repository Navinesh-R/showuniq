public class ARectangle20 {
    double length;
    double width;
    double getArea(){
        
        return length * width;
    }
    public static void main(String[] args) {
        ARectangle20 obj = new ARectangle20();
        obj.length = 20;
        obj.width = 15;
        double hi = obj.getArea();
        System.out.println(hi);
    }
}
