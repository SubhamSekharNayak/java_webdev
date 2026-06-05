import java.util.HashMap;

public class test16 {
    public static void main(String[] args) {
        HashMap<Integer, String> hm=new HashMap<>();

        hm.put(1, "one");
        hm.put(2, "two");
        hm.put(3, "three");

        System.out.println(hm);
        System.out.println(hm.get(3));

        hm.remove(2);
        System.out.println(hm);
    }
}