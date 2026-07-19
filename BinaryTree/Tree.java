package BinaryTree;

public class Tree {
    private class Node {
        private int val;
        private Node left;
        private Node right;

        public Node(int val) {
            this.val = val;
        }

        @Override
        public String toString() {
            return "Node="+val;
        }
    }

    public Node root;

    public void insert(int val) {

        Node newNode = new Node(val);

        if(root == null) {// left <- val -> right
            root = new Node(val);
            return;
        }

        Node current = root;

        while(true) {
            if (val < current.val) {
                if (current.left == null) {
                    current.left = newNode;
                    break;
                }
                current = current.left;
            } else {
                if (current.right == null) {
                    current.right = newNode;
                    break;
                }
                current = current.right;
            }
        }
    }

    public boolean find(int value) {
        Node current = root;
        while(current != null) {
            if(value < current.val) {
                current = current.left;
            } else if(value > current.val) {
                current = current.right;
            } else {
                return true;
            }
        }
        return false;
    }

    // Depth first traversal
    public void preOrder(Node root) {
        if(root == null)
            return;

        System.out.print(root.val + " ");
        preOrder(root.left);
        preOrder(root.right);

    }

    public void inOrderA(Node root) { // Ascending order
        if(root == null)
            return;

        preOrder(root.left);
        System.out.print(root.val + " ");
        preOrder(root.right);

    }

    public void inOrderD(Node root) { // Descending order
        if(root == null)
            return;

        inOrderD(root.right);
        System.out.print(root.val + " ");
        inOrderD(root.left);

    }

    public void postOrder(Node root) { // visit leaf node first
        if(root == null)
            return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val + " ");

    }

    public int maxHeight(Node root) {
        if(root == null)
            return -1;
        if(root.left == null && root.right == null) // base condition
            return 0; // to check weather it is leaf or not
        return 1 + Math.max(maxHeight(root.left), maxHeight(root.right));
    }

    public static int factorial(int n) { // 4!
        if(n == 0)
            return 1;
        return n * factorial(n-1);
    }
}
