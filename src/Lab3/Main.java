package Lab3;

import java.util.*;

import static java.lang.Math.*;

class Ex1 {
    public static void main(String[] args) {
        final float RANGE_START = 2;
        final float RANGE_END = 6;
        final double step = 0.5;

        System.out.print("Enter num: ");
        Scanner in = new Scanner(System.in);
        float num;
        num = in.nextFloat();

        if (num < 4.0) {
            System.out.println("   x           y    ");
            for (float x = RANGE_START; x < RANGE_END; x += step) {
                double k=3;
                while (k<8) {
                    float y;
                    y = (float) (PI * sqrt(pow(x, 2) + k));
                    System.out.printf("%f   %f\n", x, y);
                    k++;
                }
                System.out.print("\n");
            }
        }
           else
            System.out.println("   x           y    ");
            for (float x = RANGE_START; x < RANGE_END; x += step) {
                float y = (float) ((x + 2) * tan(pow(x, 2) - 3));
                System.out.printf("%f   %f\n", x, y);

            }
        }
    }

class Ex2{
    public static void main(String[] args) {
        double x;
        double sum = 0;

        System.out.print("Enter x: ");
        Scanner in =new Scanner(System.in);
        x=in.nextFloat();
        System.out.print("Answer:");
        for (double m=1;m<4;m++){
            sum+=m;
            double y= pow(x,2) + sum*((pow(x,2)*m)/(m+1));
            System.out.printf("%f\n", y);
        }
    }

}

class Ex3{
    private static void main(String[] args) {

    }


}
