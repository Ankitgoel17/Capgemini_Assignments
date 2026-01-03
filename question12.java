import java.util.*;

public class question12 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int sum=n*(n+1)/2;
        int sum1=0;
        while(n>=1){
            sum1+=n;
            n--;

        }
        System.out.println(sum);
        System.out.println(sum1);
        System.out.println(sum==sum1);
    }
    
}
