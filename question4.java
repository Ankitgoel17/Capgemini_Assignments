import java.util.*;
public class question4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        if(n<2){
            System.out.println("enter a valid number");
        }
        else{
            for(int i=2;i<=n;i++){
                if(n%i==0){
                    System.out.println(i);
                    
                }
            }
        }
    }
    
}
