import java.util.*;

public class question15 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int fact=1;
        for(int i=n;i>=1;i--){
            fact*=i;

        }
        System.out.println(fact);
        
    }
    
}
