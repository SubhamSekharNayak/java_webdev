import java.util.LinkedHashMap;

public class test20 {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> lm=new LinkedHashMap<>();
        lm.put(1, "a");
        lm.put(2, "b");
        lm.put(3, "c");
        for(Integer key : lm.keySet()) {
            System.out.println(lm.get(key));
        }
        System.out.println(lm);
        lm.remove(2);
        System.out.println(lm);
    }
}
