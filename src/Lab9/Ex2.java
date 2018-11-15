package Lab9;

import org.omg.CORBA.INTERNAL;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static jdk.nashorn.internal.runtime.JSType.isNumber;

public class Ex2 {
    public static void main(String[] args) throws Exception {
        FileWriter newFile = new FileWriter("Test2.txt");
        newFile.write("44, ()hi, 21, *, 14wewe, wef*, dad, qwrasda");
        newFile.close();
        Files.lines(Paths.get("Test.txt"), StandardCharsets.UTF_8).forEach(System.out::println);
        File path_to_file = new File("Test.txt");
        FileInputStream inFile = new FileInputStream(path_to_file);
        byte[] str = new byte[inFile.available()];
        inFile.read(str);
        String text = new String(str);

        String test = text.substring(0, 2);
        boolean isNumeric = test.chars().allMatch(Character::isDigit);
//        System.out.println(isNumeric);

        if (isNumeric == true) {
            int par = Integer.parseInt(test);
            if (par % 2 == 0) {
                System.out.println("Первые 2 символа - числа и она парные");

            } else
                System.out.println("Ne Parne");
        } else
            System.out.println("Первые 2 символа не число");

        String bEnd = null;
        String b = text.substring(0);
        if (b.matches("[a-z][A-Z]")) {
            FileWriter newFile2 = new FileWriter("Test3.txt");
            newFile2.write(b);
            newFile2.close();
        } else

            bEnd=getOnlyStrings(b);
//                bEnd = b.replaceAll(" (?u)[^a-zA-z]","").replaceAll("\\d", "").replaceAll(",","");
        FileWriter newFile2 = new FileWriter("Test23.txt");
        newFile2.write(bEnd);
        newFile2.close();

        Files.lines(Paths.get("Test23.txt"), StandardCharsets.UTF_8).forEach(System.out::println);

    }

    private static String getOnlyStrings(String b) {

            Pattern pattern = Pattern.compile("[^a-z A-Z]");
            Matcher matcher = pattern.matcher(b);
            String number = matcher.replaceAll("");
            return number;
    }

}







