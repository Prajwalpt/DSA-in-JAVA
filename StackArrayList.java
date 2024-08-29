import java.util.ArrayList;
public class StackArrayList {
    static class Stack{
        ArrayList<Integer> list = new ArrayList<>();
        
        //push()
        public void push(int data){
            list.add(data);
        }
        public boolean isEmpty(){
            return list.size() == 0; 
        }
        
        //pop()
        public int pop(){
            if (isEmpty()) {
                return -1;
            }
            int top = list.remove(list.size()-1);
            return top;
        }

        //peek()
        public int peek(){
            if (isEmpty()) {
                return -1;
            }
            return list.get(list.size()-1);  
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(93);
        s.push(33);
        s.push(18);
        s.push(45);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
