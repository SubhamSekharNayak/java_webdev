// import java.io.FileNotFoundException;
// import java.io.FileReader;

// class test {
//     public static void main(String[] args) throws FileNotFoundException{
//         FileReader fr = new FileReader("raja.txt");

//         // try {
//         //     FileReader fr = new FileReader("raja.txt");

//         // } catch (FileNotFoundException e) {

//         // }
//     }

// }

// // this is a checked exception; unless you use try catch, it won't run.

import java.util.*;

class test {
    static void valid(int a) throws Exception {

        if (a != 6) {
            throw new Exception("age should be 6");
        }
    }

    public static void main(String[] args) {
        System.out.println(("Enter age for std1 adm:"));
        try {
            int age = new Scanner(System.in).nextInt();
            valid(age);
            System.out.println("valid for adm...");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}