/*
package Lab7;

import Lab8.Matrix;
import Lab8.MatrixUtil;

public class Lab7 {
*/
/*    public static void main(String[] args) throws NumberFormatException, IOException {
        int x, y;

*//*
*/
/*        Scanner in = new Scanner(System.in);
        System.out.print("Enter i: ");
        x = in.nextInt();
        System.out.print("Enter j: ");
        y = in.nextInt();


        Matrix first = new Matrix(x, y);
        MatrixUtil.fill(first);
        MatrixUtil.print(first);
        System.out.println(first.getElement(1, 1));

        System.out.println(first.length);
        System.out.println(first.getLength);
        int count =0;
        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < first[0].length; j++) {
                if (first.getElement[i][j] < 0) count++;
            }
        }
    }
}*//*


    public static void main(String arg[]) {//Пишу тут только мэйн на функцию сами сделаете))
        int mat[][] = {{1, 2, 3, -1}, {-1, -5, -7, 8}, {1, 2, -3, 0}};//матрица 3*4 можно через рандом заполнять матрицу
        Matrix mat = new Matrix(4,4);
        MatrixUtil.fill(mat);
        System.out.println(mat.getRowsNum);
        System.out.println(mat.getColumsNum);
        System.out.println(mat.length);
        int count = 0;// count будет считать отрицательные числа в матрице
        for (int i = 0; i < mat.getRowsEl; i++) {
            for (int j = 0; j < mat.getColumsEl; j++) {
                if (mat.getElement(i,j) < 0) count++;
            }
        }
        System.out.println("Count is: " + count);//вывод количеств аотрицательных элементов матрицы
    }
}


 */
/*       int count = 0;
*//*
*/
/*        for (first.getElement(x, y); ; x++)
            if (x < 0) {
                count++;
                System.out.println("Отрицательных елементов в матрице " + count);
            }*//*
*/
/*



        for (int i =0; i==(first.length); i++) {
            if (first.getElement(x,y) < 0) {
                count++;
            }

            for (int j = 0; j ==(first.length); j++) {
                if (first.getElement(j,j) < 0) {
                    count++;
                }

*//*
*/
/*        for (i = 0; i < x; i++) {
            for ( j = 0; j<y; j++){
                if (j<0){
                 count++;
             }
            System.out.println(count);
            }*//*
*/
/*
//            исли бит номер i еденичный, печатаем i-й элемент массива
            if (i<0) {
                count++;

            }
            System.out.println(count);
        }

            }
            System.out.println("Отрицательных елементов в матрице " + count);
        }
//        System.out.println("Отрицательных елементов в матрице " + count);
    }
*//*



*/
