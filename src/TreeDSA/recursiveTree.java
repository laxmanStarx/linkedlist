package TreeDSA;

import java.util.Scanner;

class Nodes {

    int data;
    Nodes left;
    Nodes right;

    Nodes(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class recursiveTree {

    static Scanner sc = new Scanner(System.in);

    static Nodes createTree() {

        int value = sc.nextInt();

        // Base condition
        if (value == -1) {
            return null;
        }

        Nodes newNodes = new Nodes(value);

        System.out.println("Enter left child of " + value);
        newNodes.left = createTree();

        System.out.println("Enter right child of " + value);
        newNodes.right = createTree();

        return newNodes;
    }

    // PREORDER TRAVERSAL
    static void preorder(Nodes root) {

        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");

        preorder(root.left);

        preorder(root.right);
    }

    public static void main(String[] args) {

        System.out.println("Enter root value:");

        Nodes root = createTree();

        System.out.println("Tree Created Successfully");

        System.out.println("Preorder Traversal:");

        preorder(root);
    }
}