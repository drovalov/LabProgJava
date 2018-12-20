package Lab4;

import java.util.Scanner;

public class Ex2{
    public static void main(String[] args) {
        int x;
        int y;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter X: ");
        x = in.nextInt();
        int[]array = new int[x];
        for (y=0;y<array.length;y++) {
            array[y] = (int) Math.round((Math.random() * (x*2) -5));
        }
//        System.out.println(array[x]);
        int count = 0;
        for(y = 0; y<x; y++)
            if(array[y] == 0)
                count++;
            if(count >=3)
            System.out.println(count);

            else
                System.out.println("Нет 3 нулей подряд. Есть только "+count);
    }
}
