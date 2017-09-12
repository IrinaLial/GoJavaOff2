package Off2;

public class GoJavaTask6 {
        public static void main(String[]args){


            double a = 5.9;
            double b = 4.8;
            double c = 7.3;

            //равняется ли A хотя бы одному из других чисел
            boolean A = ((a == b) || (a == c));
            System.out.println("Равняется ли A хотя бы одному из других чисел? " + A);

            //равняется ли B хотя бы одному из других чисел
            boolean B = ((b == a) || (b == c));
            System.out.println("Равняется ли B хотя бы одному из других чисел? " + B);

            //равняется ли C хотя бы одному из других чисел
            boolean C = ((c == a) || (c == b));
            System.out.println("Равняется ли C хотя бы одному из других чисел? " + C);

            //A больше хотя бы одного из других чисел
            boolean A1 = ((a > b) || (a > c));
            System.out.println("A больше хотя бы одного из других чисел? " + A1);

            //B больше хотя бы одного из других чисел
            boolean B1 = ((b > a) || (b > c));
            System.out.println("B больше хотя бы одного из других чисел? " + B1);

            //C больше хотя бы одного из других чисел
            boolean C1 = ((c > a) || (c > b));
            System.out.println("C больше хотя бы одного из других чисел? " + C1);
        }

    }
