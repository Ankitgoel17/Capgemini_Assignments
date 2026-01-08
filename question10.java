import java.util.*;

public class question10 {
    static double calculateWindChill(double temperature, double windspeed){
        double windchill=35.74 + 0.6215 *temperature + (0.4275*temperature - 35.75)*Math.pow(windspeed,0.16);
        return windchill;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double temperature=scan.nextDouble();
        double windspeed=scan.nextDouble();
        double result=calculateWindChill(temperature, windspeed);
        System.out.println("The windchill is: " + result);
    }
    
}
