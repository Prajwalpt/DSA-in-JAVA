public class QueueCircular {
    static class Queue{
        static int arr[];
        static int size;
        static int rear;
        static int front;
        //setting size,front and rear
        @SuppressWarnings("static-access")
        Queue(int size){
            this.size = size;
            arr = new int[size];
            rear = -1;
            front = -1;
        }

        //underflow
        public static boolean isEmpty(){
            return rear == -1 && front == -1;
        }

        //overflow
        public static boolean isFull(){
            return (rear+1) % size == front;
        }

        //Enqueue
        public static void add(int data){
            if (isFull()) {
                return;
            }
            //first element
            if (front==-1) {
                front = 0;
            }
            //condition of circular queue
            rear = (rear+1) % size;
            arr[rear] = data;
        }

        //Dequeue
        public static int remove(){
            if (isEmpty()) {
                return -1;
            }
            int result = arr[front];
            
            //single element
            if (rear == front) {
                rear = front = -1;
            }
            else{
                front = (front+1) % size;
            }
            return result;
        }

        //peek
        public static int peek(){
            return arr[front];
        }
    }

    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q.remove());
        q.add(6);
        System.out.println(q.remove());
        q.add(7);
        //rear->front->front+1->front+2->rear-1
        while (!q.isEmpty()) {
            System.out.println(q.remove());    
        }
    }
}
