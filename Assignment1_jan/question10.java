import java.util.*;

public class question10 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double num=scan.nextInt();
        double total=0.0;
        if(num==0){
            System.out.println("given number is zero");
        }
        while(num!=0){
            total+=num;
            num=scan.nextInt();
        }
        System.out.println(total);
      }
    
}
