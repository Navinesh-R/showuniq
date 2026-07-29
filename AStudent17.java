public class AStudent17
{
    String studentName;

    String getStudentName(){
        return studentName;
    }
    public static void main(String[] args) {
        AStudent17 obj = new AStudent17();
        obj.studentName = "Arun";
        String name = obj.getStudentName();
        System.out.println(name);

    }
}