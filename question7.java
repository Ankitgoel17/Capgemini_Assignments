import java.util.*;
public class question7 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int greatest_factor=1;
        int counter=n-1;
        while(counter>1){
            if(n%counter==0){
                greatest_factor=counter;
                System.out.println(greatest_factor);
                break;
            }
        }
        
    }
    
}
