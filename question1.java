import java.util.*;

public class question1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int[] arr=new int[10];
        System.out.println("enter the age of 10 person:");

        for(int i=0;i<arr.length;i++){
            
            arr[i]=scan.nextInt();
        }
        for(int age:arr){
            if(age<=0 ){
                System.out.println("Invalid age");
            }
            else if(age>=18){
                System.out.println("The student with age" + age + " can vote");
            }
            else{
                System.out.println("The student with age " + age + " cannot vote");
            }
        }
    }
    
}
