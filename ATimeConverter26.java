public class ATimeConverter26 {
    int convertToSeconds(int minutes){
        
        return minutes * 60;
    }
    public static void main(String[] args) {
        ATimeConverter26 obj = new ATimeConverter26();
        int seconds = obj.convertToSeconds(30);
        System.out.println("seconds"+seconds);

    }
}
