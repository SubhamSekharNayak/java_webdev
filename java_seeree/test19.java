import java.util.PriorityQueue;

public class test19 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();

        pq.offer(30);
        pq.offer(50);
        pq.offer(10);
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq.peek());
    }
}