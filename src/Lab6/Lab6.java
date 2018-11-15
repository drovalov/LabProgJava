package Lab6;

import java.util.Scanner;

public class Lab6 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String hello = in.nextLine();
        System.out.print("Введите искомый символ: ");
        String ch = in.nextLine();
        int index1 = hello.indexOf(ch);
        if (index1 >= 0)
        {
            String subStr = hello.substring(index1 + 2);
            System.out.println(subStr);
        }
        else
            System.out.print("В строке не найден заданный символ");
    }
}




