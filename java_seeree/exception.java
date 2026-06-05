// import java.util.Scanner;
// class test {
//     public static void main(String[] args) {
//         System.out.println("start....");
//         Scanner sc=new Scanner(System.in);
//         int i=sc.nextInt();
//         int j=sc.nextInt();
//         System.out.println("sum = "+(i+j)+"  div = "+(i/j));
//         System.out.println("end....");
//     }
// }

// //Types of Exceptions :

// //InputMismatchException due to enter ten except 10
// //ArithmeticException due to user enter 0 as 2nd number or use of decimals 








// Example to handle Exception

import java.util.*;

class test {
    public static void main(String[] args) {
        System.out.println("start...");
        Scanner sc = new Scanner(System.in);
        try {
            int i = sc.nextInt();
            int j = sc.nextInt();
            System.out.println("sum = " + (i + j) + " div = " + (i / j));
// you can simply write Exception because it is parent to all but is slower
        // } catch (ArithmeticException e) {          
        //     System.out.println(e.getMessage());
        // } catch (InputMismatchException e) {
        //     System.out.println(e.getMessage());
        // }

        }catch(Exception e) {
            System.out.println(e.getMessage());
        }finally{
            System.out.println("clean up code....");
        }
        System.out.println("end...");
    }
}