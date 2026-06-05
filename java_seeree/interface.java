// interface Agenda1
// {
//     void task1();

// }
// interface Agenda2
// {
//     void task2();

// }
// class Meeting implements Agenda1 , Agenda2 {
//     public void task1(){
//         System.out.println("task1 done...");
//     }
//     public void task2(){
//         System.out.println("task2 done...");
//     }
//     public static void main(String[] args) {
//         Meeting m=new Meeting();
//         m.task1();
//         m.task2();
//     }
// }


interface Agenda1
{
    int a=10;
    void task1();
}

// interface Agenda1
// {
//     // void task1();

// }
// interface LastAgenda extends Agenda1
// {
//     // void task2();
// }
// class A implements LastAgenda
// {
//     public void task1()
//     {
//         System.out.println("hello task1");
//     }
//     public void task2()
//     {
//         System.out.println("hello task2");
//     }
//     public static void main(String[] args) {
//         A obj = new A();
//         obj.task1();
//         obj.task2();
//     }
// }