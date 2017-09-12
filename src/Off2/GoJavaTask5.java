package Off2;

public class GoJavaTask5 {
    public static void main(String[]args){
        double a = 4.0;
        double b = 5.0;
        double c = 8.0;

        //является ли A наибольшим числом (true / false)
        System.out.println("a > b и c:" + (c<a && b<a));
        //является ли B наибольшим числом (true / false)
        System.out.println("b > a и c:"+ (c<b && a<b));
        //является ли C наибольшим числом (true / false)
        System.out.println("c > a и b:" + (b<c && a<c));

        //является ли A наименьшим числом (true / false)
        System.out.println("a < b и c:" + (c>a && b>a));

        //является ли B наименьшим числом (true / false)
        System.out.println("b < a и c:"+ (c>b && a>b));

        //является ли C наименьшим числом (true / false)
        System.out.println("c < a и b:" + (b>c && a>c));


        boolean A = (a > b && a < c || a > c && a < b);

        System.out.println("является ли A промежуточным числом между B и C?:"+ A);

        boolean B = (b > a && b < c || b > c && b < a);
        System.out.println("является ли B промежуточным числом между A и C?:"+ B);

        boolean C = (c > a && c < b || c > b && c < a);
        System.out.println("является ли C промежуточным числом между A и B?:"+ C);

    }
}
