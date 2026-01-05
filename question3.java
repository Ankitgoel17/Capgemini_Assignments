import java.util.*;
public class question3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int p1_age=scan.nextInt();
        int p2_age=scan.nextInt();
        int p3_age=scan.nextInt();
        if(p1_age<p2_age && p1_age<p3_age){
            System.out.println("person 1 is youngest");
        }else if(p2_age<p1_age && p2_age<p3_age){
            System.out.println("person 2 is youngest");
        }else{
            System.out.println("person 3 is youngest");
        }
        int p1_height=scan.nextInt();
        int p2_height=scan.nextInt();
        int p3_height=scan.nextInt();
        if(p1_height>p2_height && p1_height>p3_height){
            System.out.println("person 1 is tallest");
        }else if(p2_height>p1_height && p2_height>p3_height){
            System.out.println("person 2 is tallest");
        }else{
            System.out.println("person 3 is tallest");
        }
    }
    
}
