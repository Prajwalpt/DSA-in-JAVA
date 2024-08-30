import java.util.ArrayList;

public class BSTNodeToLeaf {
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

    public static Node insert(Node root, int val){
        if (root==null) {
            root = new Node(val);
            return root;
        }
        else if (root.data > val) {
            root.left = insert(root.left, val);
        }
        else{
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    //print path ArrayList
    public static void printPath(ArrayList<Integer>path){
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i)+"->");
        }
        System.out.println("null");
    }

    //PathToLeaf
    public static void print2Leaf(Node root, ArrayList<Integer>path){
        if (root==null) {
            return;
        }
        path.add(root.data);

        if (root.left==null && root.right==null) {
            printPath(path);
        }
        else{
            print2Leaf(root.left, path);
            print2Leaf(root.right, path);
        }

        //backtracking by removing data
        path.remove(path.size()-1);
    }
    public static void main(String[] args) {
        int values[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;  
        
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        inorder(root);
        System.out.println();
        print2Leaf(root, new ArrayList<>());
    }
}
