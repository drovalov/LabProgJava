package Lab1;
 import java.util.Scanner;

import static java.lang.Math.pow;

public class  Main {

    public static void main(String[] args) {
        int x, y;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите x: ");
        x = in.nextInt();


        if (x <= 2) {
            y = (int) (pow(x, 2) + 4 * x + 5);
            System.out.print("y=" + y);
        } else
            System.out.print("y=1" + (pow(x, 2) + 4 * x + 5));
    }

}
class  Ex2{
    public static void main(String[] args) {
        double x,y;
        System.out.println("Enter X: ");
        Scanner in = new Scanner(System.in);
        x=in.nextFloat();

        if (x>=(-1) || x<=1){
            y=x;
            System.out.println("If x =" + x + "Y=" + y);
        }
        else
            if (x<(-1) || x>1){
            y=pow(x,2);
                System.out.println("If x =" + x + "Y=" + y) ;

            }
    }
}
