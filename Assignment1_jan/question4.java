import java.util.*;

public class question4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        if(n>0){
            int sum=n*(n+1)/2;
            System.out.println("The sum of " + n + " positive integer is " + sum);
        }
        else{
            System.out.println("given number is not a natural number");
        }

    }
    
}
