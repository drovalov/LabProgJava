package Lab4;

import java.util.Scanner;


 class Ex1{
     public static void main(String[] args) {
         int n ;
         int Z;
         int y=0;
         Scanner in = new Scanner(System.in);
         System.out.print("Input n: ");
         n = in.nextInt();
         int array[] = new int[n];
         for (;y<array.length;y++) {
             array[y] = (int) Math.round((Math.random() * (342)));
         }
         int componenta = array[y];
     }
 }


/*class Ex3{
    public static void main(String[] args) {
        float x,y;


        Scanner in =new Scanner(System.in);
        System.out.print("Введите x: ");
        x=in.nextFloat();
        y= (float) ((x+2)* tan(pow(x,2)-3));
        System.out.println("Answer = " + y);


    }
}*/



