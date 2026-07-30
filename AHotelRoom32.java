/*public class AHotelRoom32 {
   
   int roomNumber;
   String roomType;
   double pricePerDay;
   double amount;
   public static void main(String[] args) {
     AHotelRoom32 obj = new AHotelRoom32();
     obj.setRoomDetails(143, "AC",5000);
     obj.calculateRoomAmout(15);
     obj.displayRoomDetails();
   }
void setRoomDetails(int number,String type, double price){
        

        roomNumber = number;
        roomType = type;
        pricePerDay = price;
    }
    void displayRoomDetails(){
        System.out.println("amount :"+ amount);
        System.out.println("roomNumber :"+roomNumber);
        System.out.println("roomType :"+ roomType );
        System.out.println("pricePerDay :"+pricePerDay);
    }

void calculateRoomAmout(int numberofDays){
    amount = numberofDays * pricePerDay;
    }
}
*/
public class AHotelRoom32 {
   
   int roomNumber;
   String roomType;
   double pricePerDay;
   double amount = 5000;
   public static void main(String[] args) {
     AHotelRoom32 obj = new AHotelRoom32();
     obj.setRoomDetails(143, "AC",5000);
     
     obj.displayRoomDetails();
   }
void setRoomDetails(int number,String type, double price){
        

        roomNumber = number;
        roomType = type;
        pricePerDay = price;
    }
    void displayRoomDetails(){
        System.out.println("amount :"+ amount);
        System.out.println("roomNumber :"+roomNumber);
        System.out.println("roomType :"+ roomType );
        System.out.println("pricePerDay :"+pricePerDay);
    }

void calculateRoomAmout(int numberofDays){
    
    
    amount = numberofDays * pricePerDay;
    }
}