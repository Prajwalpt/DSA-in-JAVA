public class BSTSearch {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    //insertion
    public static Node insert(Node root,int val){
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data > val) {
            root.left = insert(root.left, val);
        }
        //(root.data < val) 
        else{
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void inorder(Node root){
        if (root==null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static boolean search(Node root, int key){
        //for null root
        if (root==null) {
            return false;
        }
        
        //if key is the root
        if (root.data == key) {
            return true;
        }

        //if key is at left side of B.S.tree
        else if (root.data > key) {
            return search(root.left, key);
        }

        //if key is at left side of B.S.tree
        else if (root.data < key) {
            return search(root.right, key);
        }
        return search(root, key);
    }
    public static void main(String[] args) {
        int values[] = {8,5,3,1,4,6,10,11,14}; 
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root,values[i]);    
        }
        inorder(root);
        System.out.println();
        if (search(root, 1)) {
            System.out.println("key 1 is found");
        }
        else{System.out.println("key 1 not found");}
    }
}
