// // class Cat {
// //     void says(){
// //         System.out.println("meau...");
// //     }
// // }
// // class Dog {
// //     void says(){
// //         System.out.println("bhouuu....");
// //     }
// // }
// // class test {
// //     public static void main(String[] args) {
// //         Cat c = new Cat();
// //         Dog d = new Dog();
// //         c.says();
// //         d.says();

// //     }
// // }

// method overloading
class Calc {
    int Add(int i, int j) {
        return i + j;
    }

    float Add(float i, float j) {
        return i + j;
    }
}

class test {
    public static void main(String[] args) {
        Calc obj = new Calc();
        
        System.out.println(obj.Add(4.6f, 6.3f));
        System.out.println(obj.Add(10, 20));

    }
}

// //method overriding
// class A{
//     int i = 100;
//     void show(){
//         System.out.println("hello parent");
//     }
// }
// class B extends A{
//     int i = 800;
//       void show(){
//         System.out.println("hello child");
//     }
// }
// class test {
//     public static void main(String[] args) {
//         // B obj=new B();
//         // A obj=new A();
//         A obj=new B();
//         System.out.println(obj.i); //100
//         obj.show(); // hello child (because of method overridding)
//     }
    
// }