// class Counter {
//     int count = 0;
//     Counter()
//     {
//         count++;
//     }

// }
// class test5 {
//     public static void main(String[] args) {
//         Counter c1 = new Counter();
//         Counter c2 = new Counter();
//         System.out.println(c1.count); //1
//         System.out.println(c2.count); //1
//     }
// }

class Counter {
    static int count = 0;
    Counter()
    {
        count++;
        // System.out.println(count);
    }

}
class test5 {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        System.out.println(c1.count); //1
        System.out.println(c2.count); //1
    }
}

