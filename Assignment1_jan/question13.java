import java.util.*;

public class question13 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int sum=n*(n+1)/2;
        int sum1=0;
        for(int i=n;i>=1;i--){
            sum1+=i;
        }
        System.out.println(sum1);
        System.out.println(sum);
        System.out.println(sum==sum1);
    }
    
}
