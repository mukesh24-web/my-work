package BinaryTreeDSA;

public class BinaryTree {
    Node root;
    class Node {
        int data;
        Node left,right;

        public Node(int d) {
            data = d;
            left = null;
            right = null;
        }
    }
    public BinaryTree(int val) {
        root = new Node(val);
    }

    public void insertLeft(Node node,int val) {
        Node nn = new Node(val);
        node.left = nn;
    }

    public void insertRight(Node node,int val) {
        Node nn = new Node(val);
        node.right = nn;
    }

    public void preOrder(Node root) {
        if(root==null) return;
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public void inOrder(Node root) {
        if(root==null) return;

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public void postOrder(Node root) {
        if(root==null) return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }
}
