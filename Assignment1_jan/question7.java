import java.util.*;

public class question7 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int month=scan.nextInt();
        int date=scan.nextInt();
        if((month==3 && date>=20) || (month==4) || (month==5) ||(month==6 && date<=20)){
            System.out.println("its a spring season");
        }
        else{
            System.out.println("not a spring season");
        }
    }
    
}
