import java.util.*;

public class questin6 {
    static int sum_of_natural_numbers(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int result=sum_of_natural_numbers(n);
        System.out.println(result);
    }
    
}
