import java.util.*;

public class question6 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double[] arr=new double[11];
        System.out.println("enter the height of 11 players:");
        for(int i=0;i<arr.length;i++){
            arr[i]=scan.nextDouble();
        }
        double sum=0.0;
        for(int i=0;i<11;i++){
            sum+=arr[i];
        }
        System.out.println("the mean height of the football team is:"+ (sum/11));
    }

    
}
