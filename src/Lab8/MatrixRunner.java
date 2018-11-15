package Lab8;

import java.io.IOException;
import java.util.Scanner;

public class MatrixRunner {


    public static void main(String[] args) throws NumberFormatException, IOException {
        int x,y;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter i: ");
        x = in.nextInt();
        System.out.print("Enter j: ");
        y = in.nextInt();

        Matrix first = new Matrix(x, y);
        MatrixUtil.fill(first);
        MatrixUtil.print(first);
        Matrix second = new Matrix(x,y);
        MatrixUtil.fill(second);
        MatrixUtil.print(second);

        Matrix mul = first.multiply(second);

        MatrixUtil.print(mul);

    }
}
