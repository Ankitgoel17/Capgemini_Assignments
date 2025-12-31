import java.util.*;
public class question10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Take height input in centimeters
        System.out.print("Enter your height in centimeters: ");
        double heightCm = scan.nextDouble();

        // Conversion
        double totalInches = heightCm / 2.54;   

        int feet = (int) (totalInches / 12);   
        double inches = totalInches % 12;

        // Output
        System.out.println("Your Height in cm is " + heightCm +
                " while in feet is " + feet +
                " and inches is " + inches);

    }
    
}
