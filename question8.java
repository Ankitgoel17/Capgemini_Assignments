import java.util.*;
public class question8 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        if(n<0 || n>100){
            System.out.println("enter a valid number");
        }
        else{
            for(int i=100;i>=1;i--){
                if(i%n==0){
                    System.out.println(i);
                    continue;
                }
            }
        }
        
    }
    
}
