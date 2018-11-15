package Lab8.test;

import java.util.Scanner;

public class MatrixCreator{
    public static void main(String[] args) {
        int x,y;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter i: ");
        x = in.nextInt();
        System.out.print("Enter j: ");
        y = in.nextInt();
        MatrixCreator matrix = new MatrixCreator(x,y);
        System.out.println("Matrix 1" +matrix);
        MatrixCreator matrix2 = new MatrixCreator(x,y);
        System.out.println("Matrix 2" +matrix2);

    }


    private int[][] matrix;
    private int x;
    private int y;

    public MatrixCreator(int x, int y) {
        this.x = x;
        this.y = y;
        matrixRandomFill(x, y);
    }

    public void matrixRandomFill(int x, int y) {
        matrix = new int[x][y];

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("\nMatrix: " + matrix.length + "x" + matrix[0].length + "\n");
        for (int[] row : matrix) {
            for (int value : row) {
                sb.append(value).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
