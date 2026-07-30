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

