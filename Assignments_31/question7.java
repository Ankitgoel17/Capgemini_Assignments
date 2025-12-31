import java.util.*;

public class question7 {
    public static void main(String[] args) {
        int radius=6378;
        double volume_km=(4.0/3)*3.14*radius*radius*radius;
         double kmToMiles = 0.621371;

        // Convert cubic kilometers to cubic miles
        double volumeMiles3 = volume_km * kmToMiles * kmToMiles * kmToMiles;

        System.out.println("The volume of earth in cubic kilometers is "
                + volume_km
                + " and cubic miles is "
                + volumeMiles3);
    }
}
    
