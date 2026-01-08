import java.util.*;

public class question3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double side1=scan.nextInt();
        double side2=scan.nextInt();
        double side3=scan.nextInt();
        double perimeter=side1+side2+side3;
        double rounds=5000/perimeter;
        System.out.println("The number of rounds possible is :" + rounds);
    }
    
}
