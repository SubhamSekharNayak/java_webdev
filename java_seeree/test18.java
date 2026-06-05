import java.util.TreeSet;

public class test18 {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(50);
          ts.add(20);
            ts.add(10);
              ts.add(5);
                ts.add(60);
                  ts.add(50);
                System.out.println(ts);
                  ts.remove(50);
                System.out.println(ts);
    }
}