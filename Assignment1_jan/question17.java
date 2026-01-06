import java.util.*;

public class question17 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int salary=scan.nextInt();
        int service=scan.nextInt();
        int bonus=salary*5/100;
        int total_salary;
        if(service>5){
            total_salary=salary+bonus;
            System.out.println("with bonus salary= " + total_salary);

        }
        else{
            System.out.println("no bonus salary= " + salary);
        }

    }
    
}
