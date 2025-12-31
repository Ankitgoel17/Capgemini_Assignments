import java.util.*;

public class question6 { 
    public static void main(String[] args) {
        int fee=125000;
        int discount_Percent=10;
        int discount=(fee*discount_Percent)/100;
        int final_fee=fee-discount;
        System.out.println("The discount amount is INR " + discount + " and the final discounted fee is INR " + final_fee);
    }
    
}
