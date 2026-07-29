public class AStudentMarks16 {
    void calculateTotal(String studentName,int mark1,int mark2,int mark3){
            System.out.println(studentName + (mark1+mark2+mark3));

    }
    public static void main(String[] args) {
        AStudentMarks16 obj = new AStudentMarks16();
        obj.calculateTotal("navinesh ", 35, 56, 69);
    }
}
