//import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
public class QueueCF {
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args) {
        // Queue q = new Queue<E>() {
        //     //invalid because Queue is interface
        // };
        Queue q = new LinkedList();
        
        //Queue qa = new ArrayDeque<>();
        
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
