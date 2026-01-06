import java.util.*;

public class question4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double[]arr=new double[10];
        double sum=0.0;
        int index=0;
        while(true){
            System.out.println("enter the number:");
            double num=scan.nextDouble();
            if(num<0){
                break;
            }
            if(index==10){
                break;
            }
            arr[index]=num;
            index++;
            sum+=num;
            }
            for(int i=0;i<index;i++){
                System.out.println("Number"+ arr[i]);
            }
            System.out.println("sum of the number:"+sum);
        }

    }
    

