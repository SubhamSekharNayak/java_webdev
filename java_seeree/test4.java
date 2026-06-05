class Employee{
    int empid;
    String empname;
    static String comp = "seeree";
    Employee (int i,String n) {
    this.empid=i;
    this.empname=n;
}
void display(){
    System.out.println(String.format("Id : %d, Name : %s, Comp : %s", this.empid, this.empname, this.comp));
}
}
class test4 {
    public static void main(String[] args) {
        Employee e1=new Employee(100,"raja");
        Employee e2=new Employee(300,"baja");
        e1.display();
        e2.display();

    }
}