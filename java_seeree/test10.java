import java.util.ArrayList;

public class test10 {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();

        name.add("a");
        name.add("b");
        name.add("c");

        System.out.println(name);
        System.out.println(name.get(1));

        name.remove("b");
        // name.addFirst("f");
        System.out.println(name);

        // System.out.println(name.get(0));
        //print index-wise using iteration

                int index = 0;
        for (String lowercase:name){
            System.out.println("Index("+ index++ +"):"+lowercase);

    }
}
}