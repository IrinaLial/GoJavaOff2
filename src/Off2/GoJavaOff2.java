package Off2;
import java.util.Scanner;

public class GoJavaOff2 {
    public static void main ( String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Task #1" );

        double a = scan.nextDouble();
        double b = scan.nextDouble();

        System.out.println ("Result:" + a + "+" + b + "" + "=" + (a + b));
        /////////////////////////

        System.out.println("Task #2" );

        int g = scan.nextInt();
        int f = scan.nextInt();
        int sqr1 = g*f;

        System.out.format("Square of rectangle %d\n", sqr1);
    }
}

