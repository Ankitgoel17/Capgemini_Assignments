import java.util.*;
public class question1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        for(int i=1;i<=n;i++){
            if(i%2==0){
                System.out.println("Even number" + i);
            }
            else{
                System.out.println("odd number " + i);
            }
        }
    }
    
}
