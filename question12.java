import java.util.*;
public class question12 {
    public static void main(String[] args) {
        
    Scanner scan = new Scanner(System.in);

        // Take base and height in inches
        System.out.print("Enter base in inches: ");
        double base = scan.nextDouble();

        System.out.print("Enter height in inches: ");
        double height = scan.nextDouble();

        // Area in square inches
        double areaInches = 0.5 * base * height;

        // Convert area to square centimeters
        double areaCm = areaInches * 2.54 * 2.54;

        // Output
        System.out.println("The area of the triangle in square inches is "
                + areaInches + " and in square centimeters is "
                + areaCm);

}}
    
