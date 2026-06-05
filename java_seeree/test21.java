import java.util.Vector;

public class test21 {
    public static void main(String[] args) {
        Vector<Integer> v=new Vector<>();
        v.add(10);
        v.add(20);
        v.add(30);
        v.add(10);
        System.out.println(v);
        v.remove(2);
        System.out.println(v);
        System.out.println(v.get(1));
    }
}

//it is quite slow, hence not used these days