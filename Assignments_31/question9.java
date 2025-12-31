import java.util.*;
public class question9 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int fee=scan.nextInt();
        int discount_Percent=scan.nextInt();
         int discount=(fee*discount_Percent)/100;
        int final_fee=fee-discount;
        System.out.println("The discount amount is INR " + discount + " and the final discounted fee is INR " + final_fee);
    }
    }
    

