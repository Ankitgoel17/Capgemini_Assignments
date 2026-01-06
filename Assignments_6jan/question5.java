import java.util.*;

public class question5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number=scan.nextInt();
        int[] arr=new int[4];
        int index=0;
        for(int i=6;i<=9;i++){
            arr[index]=number*i;
            index++;
        }
        index=0;
        for(int i=6;i<=9;i++){
            System.out.println(number + " * " + i + " = " + arr[index]);
            index++;
        }

    }
}
