import java.util.*;

public class question2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int max_handshake=n*(n-1)/2;
        System.out.println("The maximum number of handshakes possible is: " + max_handshake);
    }
    
}
