// class Employee {
//     int empid;
//     String ename;
//     Employee (int id, String n){
//         empid = id;
//         ename = n;
//     }
// }
// class test7 {
//     public static void main(String[] args) {
//         Employee e1 = new Employee(100, "raja");
//         Employee e2 = new Employee(100, "baja");
//         // System.out.println(e1.empid);
//         // System.out.println(e1.ename);
//         // System.out.println(e2.empid);
//         // System.out.println(e2.ename);
//         System.out.println(String.format("Id : %d, Name : %s", e1.empid,e2.ename ));
//     }
// }

class Employee {
    int empid;
    String ename;
    Employee(int empid, String ename){
        this.empid = empid;
        this.ename = ename;
       
    }
}
class test7{
    public static void main(String[] args) {
     Employee e1 = new Employee(100, "raja");
     System.out.println(e1.empid); //100
     System.out.println(e1.ename); //raja
    
     
    }
}