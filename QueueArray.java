public class QueueArray {
    static class Queue{
        //defining array with its size
        static int arr[];
        static int size;
        //rear->end of array
        //initialize with -1 => empty queue
        static int rear = -1;
        @SuppressWarnings("static-access")
        Queue(int size){
            this.size = size;
            arr = new int[size];
            rear = -1;
        }

        public static boolean isEmpty(){
            return rear == -1;      //if yes then it is empty
        }
        
        public static boolean isFull(){
            return rear == size-1;      //if yes then it is full
        }

        //Enqueue
        public static void add(int data){
            if (isFull()) {
                System.out.println("queue overflow");
                return;
            }
            //incrementing rear and adding data
            arr[++rear] = data;
        }

        //dequeue
        public static int remove(){
            if (isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }
            //first element is at index 0
            int front = arr[0];
            //removing elements from 0 to rear 
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i+1];
            }
            //we have to reduce rear as we are removing elements
            rear--;
            return front;
        }

        public static int peek(){
            if (isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }
            return arr[0];
        }
    }
    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();    
            //System.out.println("element at front: "+q.peek());
        }
        System.out.println("element at front: "+q.peek());

    }
}
