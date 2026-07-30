//Create a Car class with brand, model, year. Instantiate 3 cars and print each.

public class BCar1 {
    String brand;
    String model;
    int year;
    public static void main(String[] args) {
        hello obj = new hello();
        obj.hi();
    }
    
}
class hello{
    void hi(){
        BCar1 obj = new BCar1();
        obj.brand = "BMW";
        obj.model = "A1";
        obj.year = 2005;
        System.out.println("brand :"+obj.brand);
        System.out.println("model :"+obj.model);
        System.out.println("year :"+obj.year);
         BCar1 obj1 = new BCar1();
        obj1.brand = "Aadi";
        obj1.model = "v34";
        obj1.year = 2016;
        System.out.println("brand :"+obj1.brand);
        System.out.println("model :"+obj1.model);
        System.out.println("year :"+obj1.year);
         BCar1 obj2 = new BCar1();
        obj2.brand = "Shift";
        obj2.model = "k1";
        obj2.year = 2015;
        System.out.println("brand :"+obj2.brand);
        System.out.println("model :"+obj2.model);
        System.out.println("year :"+obj2.year);
    }
}
