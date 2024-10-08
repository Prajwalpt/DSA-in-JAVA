public class QueueLL {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }
        static class Queue{
            static Node head = null;
            static Node tail = null;
            //UNDERFLOW 
            public static boolean isEmpty(){
                return head==null && tail==null;
            }
            
            //enqueue
            public static void add(int data){
                Node newNode = new Node(data);
                //single element
                if (tail==null) {
                    tail = head = newNode;
                }
                tail.next = newNode;
                tail = newNode;  
            }

            //dequeue
            public static int remove(){
                if (isEmpty()) {
                    return -1;
                }
                int front = head.data; 
                //single element
                if (head==tail) {
                    tail = null;
                }
                head = head.next;
                return front;
            }

            public static int peek(){
                return head.data;
            }

        }

    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
