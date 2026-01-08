

import java.util.*;

public class question11 {
   static double[] calculateTrignometricFunctions(double angle){
        double radians=Math.toRadians(angle);
        double[] results=new double[3];
        double sine=Math.sin(radians);
        double cosine=Math.cos(radians);
        double tangent=Math.tan(radians);
        return new double[]{sine,cosine,tangent};
   }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double angle=scan.nextDouble();
        double[] results=calculateTrignometricFunctions(angle);
        System.out.println("Sine: " + results[0]);
        System.out.println("cosine: " + results[1]);
        System.out.println("tangent: " + results[2]);

    }
    
}
