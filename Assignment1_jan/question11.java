import java.util.*;

public class question11 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double total=0.0;
        double num;
        while(true){
            num=scan.nextInt();
            if(num<=0){
                break;
            }
            total+=num;
        }
        System.out.println(total);

    }
    
}
