import java.util.LinkedList;

public class test11 {
    public static void main(String[] args) {
        LinkedList<String> name = new LinkedList<>();

        name.add("a");
        name.add("b");
        name.add("c");
        System.out.println(name);
        name.addFirst("A");
        System.out.println(name);
        name.addLast("A");
        System.out.println(name);
        name.removeLast();
        System.out.println(name);
        name.removeFirst();
        System.out.println(name);

        // System.out.println(name);
        // System.out.println(name.get(1));

        // name.remove("b");
        // // name.addFirst("f");
        // System.out.println(name);

        // System.out.println(name.get(0));

    }
}