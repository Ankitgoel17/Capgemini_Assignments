import java.util.*;
public class question27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take weight input in pounds
        System.out.print("Enter weight in pounds: ");
        double weightInPounds = input.nextDouble();

        // Conversion: 1 pound = 1 / 2.2 kg
        double weightInKg = weightInPounds / 2.2;

        // Output
        System.out.println("The weight of the person in pound is " + weightInPounds +
                " and in kg is " + weightInKg);

        input.close();
        
    }
}
