import java.util.*;

public class question5 {
    public static void main(String[] args) {
        int pens=14;
        int students=3;
        int pens_per_student=pens/students;
        int remaining_pen=pens%students;
        System.out.println("The Pen Per Students is " + pens_per_student + " and the remaining pen not distributed is " + remaining_pen);
    }
    
}
