class Adigitadd{
    public static void main(String[] args) {
        int a = 245;
        int b =0;
        int c;
        
        while(a != 0){
            c = a % 10;
            b += c;
           
            a = a / 10;
            
        }
        System.out.println(b);
    }
}