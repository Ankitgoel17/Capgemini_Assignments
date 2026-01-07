import java.util.*;

public class question8 {
    static int[] find_remainder_and_quotient(int number,int divisor){
        int remainder=number%divisor;
        int quotient=number/divisor;
        int[] result = {remainder,quotient};
        return result;
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int number=scan.nextInt();
        int divisor=scan.nextInt();
        int[] result = find_remainder_and_quotient(number, divisor);
        System.out.println("Remainder: " + result[0]);
        System.out.println("quotient: " + result[1]);
    }
    
}
