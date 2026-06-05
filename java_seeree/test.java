class Employee{
    int eid;
    String ename;

}
class test {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        // Employee e2 = new Employee();

        e1.eid=100;
        System.out.println(String.format("Id : %d , Name : %s", e1.eid,e1.ename));

    }
}