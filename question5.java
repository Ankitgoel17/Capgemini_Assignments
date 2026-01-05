import java.util.*;

public class question5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int age=scan.nextInt();
        if(age>=18){
            System.out.println("The person age is "+ age +"and can vote");
        }
        else{
        System.out.println("The person age is "+ age+ " can not vote");}
    }
    
}
