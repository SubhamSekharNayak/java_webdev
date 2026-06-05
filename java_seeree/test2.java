// class Employee{
//     int eid;
//     String ename;
//     static String compname = "seeree";

// }
// class test2 {
//     public static void main(String[] args) {

//         Employee e1 = new Employee();
//         Employee e2 = new Employee();
//         Employee e3 = new Employee();
//         e1.eid = 100;
//         e2.eid = 200;
//         System.out.println(e1.compname); //seeree
//         System.out.println(e2.compname); //seeree
//     }

// }


class Employee{
    static String compname = "seeree";

}
class test2 {
    public static void main(String[] args) {
        System.out.println(Employee.compname);
    }
}