package Lab4;

import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.tan;


 class Ex1{
     public static void main(String[] args) {
         int x ;
         int Z;
         int y=0;
         Scanner in = new Scanner(System.in);
         x = in.nextInt();
         int[]array = new int[x];
         for (;y<array.length;y++) {
             array[y] = (int) Math.round((Math.random() * (x*2) -5));
         }
         int componenta = array[y];
     }
 }

class Ex2{
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
        System.out.println(array[x]);
        int count = 0;
        for(y = 0; y<x; y++)
            if(array[y] == 0)
                count++;
        System.out.println(count);
    }
}


class Ex3{
    public static void main(String[] args) {
        float x,y;


        Scanner in =new Scanner(System.in);
        System.out.print("Введите x: ");
        x=in.nextFloat();
        y= (float) ((x+2)* tan(pow(x,2)-3));


    }
}

