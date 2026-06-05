// class Address {

//     String city;
//     String state;
// }

// class Employee extends Address {
//     int eid;
//     String ename;

// }

// class test14 {
//     public static void main(String[] args) {
//         Employee e1 = new Employee();
//         e1.city = "bbsr";
//         e1.state = "odisha";
//         e1.eid = 100;
//         e1.ename = "raja";
//         System.out.println(String.format("City: %s", e1.city));
//     }
// }

class Address1
{
    String c = "india";
}
class Address2 extends Address1 {

    String city;
    String state;
}

class Employee extends Address2 {
    int eid;
    String ename;

}

class inheritance {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.city = "bbsr";
        e1.state = "odisha";
        e1.eid = 100;
        e1.ename = "raja";
        System.out.println(String.format("City: %s", e1.c));
    }
}






