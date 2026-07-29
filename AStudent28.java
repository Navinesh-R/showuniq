public class AStudent28 {
    int studentId;
    String studentName;

    void setStudentDetails(int id, String name) {
        studentId = id;
        studentName = name;
    }
    void displayStudentDetails(){
        System.out.println("studentid ="+studentId);
        System.out.println("studentName ="+studentName);
 }
    public static void main(String[] args) {
        AStudent28 obj = new AStudent28();
        obj.setStudentDetails(20244, "navinesh");
        obj.displayStudentDetails();


    }
}
