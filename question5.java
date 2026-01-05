import java.util.*;
public class question5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        if(n<2){
            System.out.println("enter a valid number");
        }else{
            int counter=2;
            while(counter<=n){
                if(n%counter==0){
                    System.out.println(counter);
                }           
                counter++;
            }
        }
        
    }
    
}
