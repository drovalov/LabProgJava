package Lab11;


import Lab11.exel.Out;

import java.io.IOException;

import static Lab11.Fakultet.createTree;
import static Lab11.Node.printTree;
import static Lab11.exel.Out.readFromExcel;

public class Main {
    public static void main(String... args) throws IOException {
        Node<String> root = createTree();
        Out root1 = readFromExcel();
//        System.out.println(root1);
//        Node<String> root = createTree();
        printTree(root, " ");
//        System.out.println(root1);
    }
}
