
import java.util.Deque;
import java.util.ArrayDeque;

public class test13 {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        deque.add("Red");
        deque.add("Green");
        deque.add("Blue");
        System.out.println("Deque:" + deque);
        deque.addFirst("Yellow");// Add to the front
        System.out.println("After addFirst:" + deque);
        deque.removeLast();// Remove from the end
        System.out.println("After removeLast:" + deque);
        // print index-wise using iteration
        System.out.println("Elements index-wise:");
        int index = 0;
        for (String color : deque) {
            System.out.println("Index(" + index++ + "):" + color);
        }

    }
}