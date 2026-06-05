abstract class Agenda 
{
    abstract void task1();
}
class Meeting extends Agenda {
    void task1(){
        System.out.println("task 1 done...");
    }
    public static void main(String[] args) {
        Meeting obj = new Meeting();
        obj.task1();
    }
}


// abstract class Meeting {
//     void task1(){
//         System.out.println("task 1 done...");
//     }
//     int i=100;
//     public static void main(String[] args) {
//         System.out.println("hello");
//     }
// }

