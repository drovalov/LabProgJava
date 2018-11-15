package Lab11;

public class Fakultet {

//    public static void main(String[] args) {
//        Node<String> root = createTree();
//        printTree(root, " ");
//    }
    public static Node <String> createTree() {
        Node<String> fakultet = new Node<>("Fakultet");
        Node<String> ki = fakultet.addChild(new Node<>("KI"));
        Node<String> kn = fakultet.addChild(new Node<>("KN"));
        Node<String> ipz = fakultet.addChild(new Node<>("IPZ"));

        Node<String> kurse1 = ki.addChild(new Node<>("Ki18"));
        Node<String> kurse2 = ki.addChild(new Node<>("Ki17"));
        Node<String> kurse3 = ki.addChild(new Node<>("ki16"));
        Node<String> kurse4 = ki.addChild(new Node<>("Ki15"));
        Node<String> kurse5 = ki.addChild(new Node<>("ki14"));

        Node<String> kurse11 = kn.addChild(new Node<>("Kn18"));
        Node<String> kurse22 = kn.addChild(new Node<>("Kn17"));
        Node<String> kurse33 = kn.addChild(new Node<>("kn16"));
        Node<String> kurse44 = kn.addChild(new Node<>("Kn15"));
        Node<String> kurse55 = kn.addChild(new Node<>("Kn14"));

        Node<String> kurse111 = ipz.addChild(new Node<>("Ipz18"));
        Node<String> kurse222 = ipz.addChild(new Node<>("Ipz17"));
        Node<String> kurse333 = ipz.addChild(new Node<>("Ipz16"));
        Node<String> kurse444 = ipz.addChild(new Node<>("Ipz15"));
        Node<String> kurse555 = ipz.addChild(new Node<>("Ipz14"));




        return fakultet;
    }
}
