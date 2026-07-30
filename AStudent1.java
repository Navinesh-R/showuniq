/*class AStudent1{
    String name;
    int rollNo;
    public static void main(String[] args){
        hello obj = new hello();
        obj.hi();
    }
}
class hello{
    void hi(){
       AStudent1 obj = new AStudent1();
       obj.name = "navin";
       obj.rollNo = 12;
       System.out.println("name :"+obj.name);
       System.out.println("rollno :"+obj.rollNo);
    }
}
    */
   /* 
   class AStudent1{
    String name;
    int rollNo;
    public static void main(String[] args) {
        hello obj = new hello();
        obj.hi("Navinesh",143);
    }
   }
   class hello{
     void hi(String word ,int ro){
        AStudent1 obj = new AStudent1();
        obj.name = word;
        obj.rollNo = ro;
        System.out.println("Name :"+obj.name);
        System.out.println("RollNo :"+obj.rollNo);
     }
   }
*/
class AStudent1{
    String Name = "navinesh";
    int rollNo;
    public static void main(String[] args) {
        hello obj = new hello();
        int a =obj.hi(244);
        System.out.println("rollno :"+a);
        hello1 obj1 = new hello1();
        String b = obj1.hi1("navinesh");
        System.out.println("Name :"+b);
    }
}
class hello{
    int hi(int R){
        AStudent1 obj = new AStudent1();     
        obj.rollNo = R;
        return R;
    }
}
class hello1{
    String hi1(String N){
        AStudent1 obj = new AStudent1();
        obj.Name = N;
        return N;
    }
}