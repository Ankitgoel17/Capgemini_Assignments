import java.util.*;

public class question2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int[] arr=new int[5];
        System.out.println("enter the 5 numbers");
        for(int i=0;i<arr.length;i++){
            arr[i]=scan.nextInt();
        }
        for(int num:arr){
            if(num>0){
                if(num%2==0){
                    System.out.println("The number " + num + " is even");
                }
                else{
                    System.out.println("The number " + num + " is odd");
                }
            }
            else if(num<0){
                System.out.println("the number " + num + " is negative");

            }
            else{
                System.out.println("The number is zero");
            }
        }
    }
    
}
