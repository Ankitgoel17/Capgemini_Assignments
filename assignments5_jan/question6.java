import java.util.*;
public class question6 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int greatest_factor=0;
        for(int i=n-1;i>=1;i--){
            if(n%i==0){
                greatest_factor=i;
                System.out.println(greatest_factor);
                break;
            }
        }
        
    }
    
}
