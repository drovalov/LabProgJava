package Lab8;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) throws NumberFormatException {
        int x, y;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter rows: ");
        x = in.nextInt();
        System.out.print("Enter colums: ");
        y = in.nextInt();

        Matrix first = new Matrix(x, y);
        MatrixUtil.fill(first);
        MatrixUtil.print(first);


    }
}
