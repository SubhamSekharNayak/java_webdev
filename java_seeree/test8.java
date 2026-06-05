class Employee{
    Employee(String n){
        this(); // call constructor
        System.out.println(n);
    }
    Employee(){
        System.out.println("hello...");
    }
}
class test8{
    public static void main(String[] args) {
        Employee e1 = new Employee("seeree");
    }
}