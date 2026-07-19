package AVLBinaryTree;

public class AVLTree {
    private class AVLNode {
        private int value;
        private AVLNode left;
        private AVLNode right;
        private int height;
        public AVLNode(int value) {
            this.value = value;
        }
    }

    private AVLNode root;

    public void insert(int value) {
        root = insert(root,value);
    }

    private AVLNode insert(AVLNode root,int value) {
        if(root == null) {
            return new AVLNode(value);
        }

        if(value < root.value)
            root.left = insert(root.left,value);
        else
            root.right = insert(root.right,value);

        setHeight(root);

        // BalanceFactor = height(L) - height(R);
        // bf > 1 => left heavy
        // bf < -1 => right heavy

        root = balance(root);

        return root;
    }

    private AVLNode balance(AVLNode root) {
        if(isLeftHeavy(root)) {
            if(balanceFactor(root.left) < 0)
                root.left = rotateLeft(root.left);
            return rotateRight(root);
        }
        else if (isRightHeavy(root)) {
            if(balanceFactor(root.right) > 0)
                root.right = rotateRight(root.right);
            return rotateLeft(root);
        }
        return root;
    }

    private AVLNode rotateLeft(AVLNode root) {
        var newRoot = root.right;

        root.right = newRoot.left;
        newRoot.left = root;

        setHeight(root);
        setHeight(newRoot);

        return newRoot;
    }

    private AVLNode rotateRight(AVLNode root) {
        var newRoot = root.left;

        root.left = newRoot.right;
        newRoot.right = root;

        setHeight(root);
        setHeight(newRoot);

        return newRoot;
    }

    private void setHeight(AVLNode node) {
        node.height = Math.max(
                height(node.left),
                height(node.right)
        ) + 1;
    }

    private boolean isLeftHeavy(AVLNode node) {
        return balanceFactor(node) > 1;
    }

    private boolean isRightHeavy(AVLNode node) {
        return balanceFactor(node) < -1;
    }

    private int balanceFactor(AVLNode node) {
        return (node == null) ? 0 : height(node.left)-height(node.right);
    }

    private int height(AVLNode node) {
        return node==null? -1:node.height;
    }


}
