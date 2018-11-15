package Lab7;

import Lab8.Matrix;
import Lab8.MatrixUtil;

import java.io.IOException;
import java.util.Scanner;

public class Lab7 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        int x, y;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter i: ");
        x = in.nextInt();
        System.out.print("Enter j: ");
        y = in.nextInt();

        Matrix first = new Matrix(x, y);
        MatrixUtil.fill(first);
        MatrixUtil.print(first);
//        System.out.println(first.getElement(x,y));


        int count = 0;
//        for (first.getElement(x,y);;x++)
//            if (x < 0){
//            count++;
//            System.out.println("Отрицательных елементов в матрице " + count);
//        }
//        for (int i = 0; i < ; ++i) {
//            if (i < 0) {
//                count++;
//            }
//
//            for (int j = 0; j < y; ++j) {
//                if (j < 0) {
//                    count++;
//                }

        for (int i = 0; i < x; i++) {
            for (int j = 0; j<y; j++){
                if (j<0){

                }
            }
            //исли бит номер i еденичный, печатаем i-й элемент массива
            if (i<0) {
                count++;

        }
        System.out.println(count);
    }
            }
//            System.out.println("Отрицательных елементов в матрице " + count);
//        }
//        System.out.println("Отрицательных елементов в матрице " + count);
//    }
}

