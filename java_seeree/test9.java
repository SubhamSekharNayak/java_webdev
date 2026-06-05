class Employee {
    int empid;
    Employee(int empid){
        this.empid = empid;
        show(this);
    }
    void show(Employee obj){
        System.out.println("hello.." +obj.empid);
    }

}
class test9 {
    public static void main(String[] args) {
        Employee e1 = new Employee(110);
    }
}