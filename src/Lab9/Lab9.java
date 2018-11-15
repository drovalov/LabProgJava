package Lab9;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

public class Lab9 {
    public Lab9() throws IOException {
    }

    public static void main(String[] args) throws Exception {
        FileWriter newFile = new FileWriter("Test.txt");
        newFile.write("10, 12, 14, 16, 18, 20");
        newFile.close();


//public class Read {
//        public void main(String[] args) throws Exception {
//        FileReader fr = new FileReader("Test.txt");
//        Scanner scan = new Scanner(fr);
//        System.out.println(scan.nextLine());
//        fr.close();

//Вывод файла
        Files.lines(Paths.get("Test.txt"), StandardCharsets.UTF_8).forEach(System.out::println);

//Замена чисел
        File path_to_file = new File("Test.txt");
        FileInputStream inFile = new FileInputStream(path_to_file);
        byte[] str = new byte[inFile.available()];
        inFile.read(str);
        String text = new String(str);

        String str1 = text.replaceAll("14", "200");
        String[] items = str1.replaceAll("\\[", "").replaceAll("\\]", "").replaceAll("\\s", "").replace("", "").split(",");

        int[] results = new int[items.length];
        for (int i = 0; i < items.length; i++) {
            results[i] = Integer.parseInt(items[i]);
//            try {
//                results[i] = Integer.parseInt(items[i]);
//            } catch (NumberFormatException nfe) {
//                System.out.println("Not");
//            };
        }
        int[] arr = new int[results.length + 300];
        for (int x : results) {
            if (x < 200) {
                x /= 2;
            }
            arr[x] = x;
        }
//update file
        String strArray[] = Arrays.stream(arr).filter(num -> num > 0)
                .mapToObj(String::valueOf)
                .toArray(String[]::new);
        String end = Arrays.toString(strArray).replace("[]", "");
        FileWriter newFile2 = new FileWriter("Test.txt");
        newFile2.write(end);
        newFile2.close();

//        Вывод файла
        Files.lines(Paths.get("Test.txt"), StandardCharsets.UTF_8).forEach(System.out::println);
    }
 }



