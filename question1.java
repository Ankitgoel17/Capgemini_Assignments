import java.util.*;
public class question1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double principal=scan.nextDouble();
        double rate=scan.nextDouble();
        double time=scan.nextDouble();
        double simple_interest=(principal*rate*time)/100;
        System.out.println("The Simple interset is :" + simple_interest + "for principal" + principal + " Rate of interest " + rate + "and  Time " + time);


    }
    
}
