class Employee{
    int empid;
    // String ename;

}
class update {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();

        e2.empid=200;
        System.out.println(e1.empid); // 0
        System.out.println(e2.empid); // 200

    }
}