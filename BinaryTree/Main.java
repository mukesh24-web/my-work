package BinaryTree;

// tree is a data structure
// It store element in hierarchy
// element are nodes
// each nodes consist of value or data
// store int, object
// ex: family tree
// starting node is root node
// last nodes are leaf node
// lines that connected are edges
// binary tree node have maximum of two children

/*
application of tree
* trees - represent hierarchical data - tree of people
* databases - dbms - use tree for indexing
* autocompletion - chrome store all past searches in tree - type a query it will match previous stored query
compilers - syntax tree to parse expression
compression( JPEG,MP3)
* */

/*
* binary tree
* left < node < right
* left sub tree < node < right sub tree
* quickly lookup the value
* search - logarithmic time complexity O(log n) - need to check
* insert - O(log n) - need to check
* delete - O(log n) - need to check
* */


/* Tree traversal:
* Breath first traversal - level order
* depth first traversal - Pre order(Root,left,right),
*                         in order (left,root,right), // ascending order
*                          -> in order (right,root,left), // descending order
*                         post order (left,right,root)
* */

// depth - count edges
// height - (reverse) go up height increase
// find the longest path head to leaf like person

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        /*
        tree.insert(10);
        tree.insert(5);
        tree.insert(15);
        tree.insert(6);
        tree.insert(7);
        */
        // System.out.println("done");

        // System.out.println(tree.find(11));

        // System.out.println(tree.factorial(4));

        /*
        tree.preOrder(tree.root);
        System.out.println();

        tree.inOrderA(tree.root);
        System.out.println();

        tree.inOrderD(tree.root);
        System.out.println();

        tree.postOrder(tree.root);
        System.out.println();
        */

        System.out.println(tree.maxHeight(tree.root));
    }
}
