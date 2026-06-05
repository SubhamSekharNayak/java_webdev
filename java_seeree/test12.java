import java.util.Stack;

public class test12 {
    public static void main(String[] args) {
        Stack<Integer> n = new Stack<>();

        n.push(10);
        n.push(8);
        n.push(9);

        System.out.println(n);

        n.pop();

        System.out.println(n);
        System.out.println(n.peek());
    }
}
