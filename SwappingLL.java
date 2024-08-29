//package DSA;
import java.util.LinkedList;
import java.util.Scanner;
public class SwappingLL {
    //swapping of adjacents
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public static LinkedList Solution(LinkedList lnum){
        for (int i = 0; i < lnum.size()-1; i+=2) {
            Object temp = lnum.set(i, lnum.get(i));
            lnum.set(i, lnum.get(i+1));
            lnum.set(i+1, temp);
        }
        System.out.println(lnum);
        return lnum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> lnum = new LinkedList<>();
        for (int i = 0; i < 4; i++) {
            lnum.add(sc.nextInt());    
        }
        System.out.println(lnum);
        Solution(lnum);
        //to swap position's value
        // for (int i = 0; i < lnum.size()-1; i++) {
        //     int temp = lnum.set(i, lnum.get(i));
        //     lnum.set(i, lnum.get(i+1));
        //     lnum.set(i+1, temp);
        // }

        //to swap adjacent's value
        sc.close();
    }

}
