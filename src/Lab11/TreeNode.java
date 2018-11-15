package Lab11;

public class TreeNode<T> {
    private T data = null;
    private TreeNode[] children = new TreeNode[100];
    private int childCount = 0;

    TreeNode(T data) {
        this.data = data;
    }

    public TreeNode addChild(T data) {
        TreeNode newChild = new TreeNode(data);
        children[childCount++] = newChild;
        return newChild;
    }

    static void traverse(TreeNode obj) {
        if (obj != null) {
            for (int i = 0; i < obj.childCount; i++) {
                System.out.println(obj.children[i].data);
                traverse(obj.children[i]);
            }
        }
        return;
    }

    void printTree(TreeNode obj) {
        System.out.println(obj.data);
        traverse(obj);
    }
}
