import java.util.*;

public class question9 {
    static int[] find_remainder_and_quotient(int number,int divisor){
        int remainder=number%divisor;
        int quotient=number/divisor;
        int[] result = {remainder,quotient};
        return result;
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int number_of_chocolates=scan.nextInt();
        int number_of_students=scan.nextInt();
        int[] result = find_remainder_and_quotient(number_of_chocolates, number_of_students);
        System.out.println("number of chocolate each student gets: " + result[1]);
        System.out.println("Remaining chocolates: " + result[0]);
    }

}