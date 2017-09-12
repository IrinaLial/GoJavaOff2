package Off2;
import java.util.Scanner;

public class GoJavaTask3 {
    public static void main (String []args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Task #3" );

        double r = scan.nextDouble();
        double d = scan.nextDouble ();
        double e = scan.nextDouble();

        double p = (r+d+e)/2;
        double s = Math.sqrt((p*(p-r)+(p-d)+(p-e)));
        System.out.printf("Square of rectangle: %.2f\n", s);
    }
}