import java.util.*;
public class question11 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double number1=scan.nextInt();
    
        
        System.out.print("Enter second number: ");
        double number2 = scan.nextDouble();

        // Perform arithmetic operations
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1 / number2;

        // Print results
        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "
                + number1 + " and " + number2 + " is "
                + addition + ", "
                + subtraction + ", "
                + multiplication + ", and "
                + division);
    }
    
}
