import java.util.*;

public class question5 {
    static boolean spring_season(int month,int day){
        if(month==3 && day>=20 && day<=31){
            return true;
        }
        else if(month==4 && day>=1 && day<=30){
            return true;
        }
        else if(month==5 && day>=1 && day<=31){
            return true;
        }
        else if(month==6 && day>=1 && day<=30){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int month=scan.nextInt();
        int day=scan.nextInt();
        boolean result=spring_season(month, day);
        System.out.println(result);
    }
    
}
