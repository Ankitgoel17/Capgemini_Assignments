import java.util.*;

public class question7 {
    static void smallest_and_largest(int a,int b,int c){
        if(a<b && a<c){
            System.out.println("Smallest: " + a);
        }
        else if(b<a && b<c){
            System.out.println("Smallest: " + b);
        }
        else{
            System.out.println("Smallest: " + c);
        }
        if(a>b && a>c){
            System.out.println("Largest: " + a);
        }
        else if(b>a && b>c){
            System.out.println("Largest: " + b);
        }
        else{
            System.out.println("Largest: " + c);
        }
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();
        smallest_and_largest(a, b, c);
        
    }
    
}
