import java.util.*;

public class question6 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int number=scan.nextInt();
        if(number>0){
            System.out.println("positive");
        }
        else if(number<0){
            System.out.println("negative");
        }
        else{
            System.out.println("zero");
        }
    }
    
}
