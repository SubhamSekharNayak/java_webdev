// class test extends Thread{ //1

//     public void run(){
//         System.out.println("task...");

//     }
//     public static void main(String[] args) {
//         test obj=new test();
//         obj.start(); // call start() execute run() by JVM
//     }

//anonymous object
// class test {
//     public static void main(String[] args) {
//         Runnable r1 = new Runnable() {
//             public void run() {
//                 System.out.println("task one");
//             }

//         };
//         Thread t1 = new Thread(r1);
//         t1.start();

//     }
// }

// }

// using Thread class

// class Mutton extends Thread {
// public void run() {
// try {
// for (int i = 0; i < 20; i++) {
// System.out.println("Mutton...");
// Thread.sleep(1000);
// }
// } catch (Exception e) {

// }
// }
// }

// class Chicken extends Thread {
// public void run() {
// try {
// for (int i = 0; i < 10; i++) {
// System.out.println("Chicken...");
// Thread.sleep(1000);
// }
// } catch (Exception e) {

// }
// }
// }

// class test {
// public static void main(String[] args) {
// Mutton m1 = new Mutton();
// m1.start();

// Chicken c1 = new Chicken();
// c1.start();
// }
// }

// using Runnable interface which is preferred in companies

// class Mutton implements Runnable {
// public void run() {
// try {
// for (int i = 0; i < 20; i++) {
// System.out.println("Mutton...");
// Thread.sleep(1000);
// }
// } catch (Exception e) {

// }
// }
// }

// class Chicken implements Runnable {
// public void run() {
// try {
// for (int i = 0; i < 10; i++) {
// System.out.println("Chicken...");
// Thread.sleep(1000);
// }
// } catch (Exception e) {

// }
// }
// }

// class test {
// public static void main(String[] args) {
// Thread t1 = new Thread(new Mutton());
// t1.start();

// Thread t2 = new Thread(new Chicken());
// t2.start();
// }
// }

// 





//to return the Thread numbers
// class Mutton implements Runnable {
//     public void run() {
//         try {
//             for (int i = 0; i < 20; i++) {
//                 System.out.println("Mutton..." + Thread.currentThread());
//                 Thread.sleep(1000);
//             }
//         } catch (Exception e) {

//         }
//     }
// }

// class Chicken implements Runnable {
//     public void run() {
//         try {
//             for (int i = 0; i < 10; i++) {
//                 System.out.println("Chicken..." + Thread.currentThread());
//                 Thread.sleep(1000);
//             }
//         } catch (Exception e) {

//         }
//     }
// }

// class Dal implements Runnable {
//     public void run() {
//         try {
//             for (int i = 0; i < 5; i++) {
//                 System.out.println("Dal..." + Thread.currentThread());
//                 Thread.sleep(1000);
//             }
//         } catch (Exception e) {

//         }
//     }
// }

// class Masala implements Runnable {
//     public void run() {
//         try {
//             for (int i = 0; i < 10; i++) {
//                 System.out.println("Masala..." + Thread.currentThread());
//                 Thread.sleep(1000);
//             }
//         } catch (Exception e) {

//         }
//     }
// }

// class test {
//     public static void main(String[] args) throws InterruptedException {
//         Thread t1 = new Thread(new Mutton());
//         Thread t2 = new Thread(new Chicken());
//         Thread t3 = new Thread(new Dal());
//         Thread t4 = new Thread(new Masala());

//         t1.start();
//         t2.start();
//         t3.start();
//         t4.start();

//     }
// }












//to set Thread names and priorities
class Mutton implements Runnable {
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Mutton..." + Thread.currentThread());
                Thread.sleep(1000);
            }
        } catch (Exception e) {

        }
    }
}

class Chicken implements Runnable {
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Chicken..." + Thread.currentThread());
                Thread.sleep(1000);
            }
        } catch (Exception e) {

        }
    }
}

class Dal implements Runnable {
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Dal..." + Thread.currentThread());
                Thread.sleep(1000);
            }
        } catch (Exception e) {

        }
    }
}

class Masala implements Runnable {
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Masala..." + Thread.currentThread());
                Thread.sleep(1000);
            }
        } catch (Exception e) {

        }
    }
}

class test {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Mutton());
        t1.setName("Thread M100");
        t1.setPriority(Thread.MAX_PRIORITY);
        Thread t2 = new Thread(new Chicken());
        t2.setName("Thread C100");
        t2.setPriority(Thread.MIN_PRIORITY);
        Thread t3 = new Thread(new Dal());
        t3.setName("Thread D100");
        t3.setPriority(Thread.MIN_PRIORITY);
        Thread t4 = new Thread(new Masala());
        t4.setName("Thread Ma100");
        t4.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}