import java.util.*;
public class question2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        if(n<=0){
            System.out.println("INvalid output");
        }
        else{
            for(int i=1;i<=n;i++){
                if(i%3==0 && i%5==0){
                    System.out.println("fizzbuzz");
                }else if(i%3==0){
                    System.out.println("fizz");
                }
                else if(i%5==0){
                    System.out.println("buzz");
                }
            }
        }
    }
    
}
