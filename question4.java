import java.util.*;

public class question4 {

   static  int check_number(int number){
        if(number<0){
            return -1;
        }
        else if(number>0){
            return 1;
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int result=check_number(n);
        System.out.println( result);
        
    }
    
}
