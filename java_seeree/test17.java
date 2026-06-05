import java.util.HashSet;

public class test17 {
    public static void main(String[] args) {
        HashSet<Integer> hs=new HashSet<>();

        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(1); //duplicate element doesn't get displayed
        hs.add(5);
        System.out.println(hs);
        hs.remove(2);
        System.out.println(hs);

    }
}