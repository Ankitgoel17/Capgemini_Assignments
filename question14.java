import java.util.*;


public class question14 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int fact=1;
        while(n>=1){
            fact=fact*n;
            n--;
        }
        System.out.println(fact);
    }
    
}
