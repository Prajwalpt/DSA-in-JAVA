//Stack using Linked List

//import java.util.Stack;

public class StackClass {
    //defining data and next of a node
    private static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }
        //defining push(),pop(),peek()
        static class Stack{
            public static Node head = null;
            //push() operation
            public static void push(int data){
                Node newNode = new Node(data);
                if(head == null){
                    head = newNode;
                    return;
                }
                newNode.next = head;    //making old head as newNode's next
                head = newNode; 
            }
            public static boolean isEmpty(){
                return head==null;
            }
            
            //pop() operation
            public int pop(){
                if (isEmpty()) {
                    return -1;
                }
                Node top = head;
                head = head.next;
                return top.data;
            }
            
            //peek() operation
            public int peek(){
                if(isEmpty()){
                    return -1;
                }
                Node top = head;
                return top.data;
            } 
            
        }
    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
