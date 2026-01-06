import java.util.*;
public class question7 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int number=scan.nextInt();
        int[]even=new int[number/2+1];
        int[]odd= new int[number/2+1];

        int even_index=0;
        int odd_index=0;
        for(int i=1;i<=number;i++){
            if(i%2==0){
                even[even_index]=i;
                even_index++;
            }
            else{
                odd[odd_index]=i;
                odd_index++;
            }
        }
        System.out.println("even numbers are:");
        for(int i=0;i<even_index;i++){
            System.out.print(even[i]+" ");
        }
        System.out.println();
        System.out.println("odd numbers are:");
        for(int i=0;i<odd_index;i++){
            System.out.print(odd[i]+" ");
        }
    }

} 