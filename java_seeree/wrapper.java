// class test {
//     int i;
//     Integer k;
//     public static void main(String[] args) {
//         test obj=new test();
//         System.out.println(obj.i); //0
//         System.out.println(obj.k); //null
//     }
// }

// public class WrapperExample {
//     public static void main(String[] args) {
//         //Autoboxing:Primitive to Wrapper
//         int num=10;
//         Integer wrappedNum=num; //Automatically converts int to Integer

//         //Unboxing:Wrapper to Primitive
//         // Integer obj=new Integer(20); 
//         Integer obj=20;
//         int primitiveNum=obj; //Automatically converts Integer to int

//         System.out.println("Wrapped Integer:"  +wrappedNum);
//         System.out.println("Unboxed Integer:"  +primitiveNum);
//     }
// }

// public class WrapperExample {
//     public static void main(String[] args) {

//         int num = Integer.parseInt("100");
//         String str = Integer.toString(200);

//         int min = Integer.min(10, 20);
//         int max = Integer.max(10, 20);

//         System.out.println("num:" + num);
//         System.out.println("str:" + str);
//         System.out.println("min:" + min);
//         System.out.println("max:" + max);
//     }
// }

class test {
    public static void main(String[] args) {

        Integer a = 127;
        Integer b = 127;
        System.out.println(a == b); // true

        Integer i = 128;
        Integer j = 128;
        System.out.println(i == j); // false     //because it lies outside the cache range(-128 to 127)
    }
}