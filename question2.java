import java.util.*;

public class question2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int number1=scan.nextInt();
        int number2=scan.nextInt();
        int number3=scan.nextInt();
        if(number1<number2 && number1<number3){
            System.out.println("number1 is smallest");
        }
        else{
            System.out.println("number1 is not smallest");
        }
    }
    
}
