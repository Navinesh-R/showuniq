public class Areversenum {
    public static void main(String[] args) {

        int number = 541;
        int reverse = 0;
        int digit;

        while (number > 0) {

            digit = number % 10; // Get last    1
            reverse = digit; // Add digit to reverse    1
            System.out.print(reverse);  //14
            number = number / 10; // Remove last digit

        }

        // System.out.println("Reversed Number = " + reverse);
    }
}
    
  