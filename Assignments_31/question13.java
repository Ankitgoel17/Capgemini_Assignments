import java.util.*;
public class question13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Take perimeter input
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = scan.nextDouble();

        // Perimeter of square = 4 * side
        double side = perimeter / 4;

        // Output
        System.out.println("The length of the side is " + side +
                " whose perimeter is " + perimeter);

    }
    
}
