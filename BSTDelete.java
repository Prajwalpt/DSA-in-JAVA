public class BSTDelete {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data > val) {
            root.left = insert(root.left, val);
        }
        // if (root.data < val)
        else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // deleting node
    public static Node delete(Node root, int val) {
        // root is null
        if (root == null) {
            return null;
        }

        if (root.data > val) {
            root.left = delete(root.left, val);
        }

        else if (root.data < val) {
            root.right = delete(root.right, val);
        }

        else {
            // leaf node
            if (root.left == null && root.right == null) {
                return null;
            }
            // 1 children
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            // 2 children
            Node IS = inorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }

    // inorder Successor of right subtree
    public static Node inorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static void main(String[] args) {
        int values[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        inorder(root);
        System.out.println();

        root = delete(root, 10);
        inorder(root);
        System.out.println();

        root = delete(root, 6);
        inorder(root);
        System.out.println();

        root = delete(root, 14);
        inorder(root);
        System.out.println();

        root = delete(root, 4);
        inorder(root);
        System.out.println();

        // deleting null node
        root = delete(root, 8);
        inorder(root);
        System.out.println();

        // deleting null node
        root = delete(root, 5);
        inorder(root);
        System.out.println();

        // deleting null node
        root = delete(root, 1);
        inorder(root);
        System.out.println();

        // deleting null node
        root = delete(root, 3);
        inorder(root);
        System.out.println();

        root = delete(root, 11);
        inorder(root);
        System.out.println("null");
    }
}
