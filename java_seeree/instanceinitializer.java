class Employee {
    {
        a=30; //instance initializer block is used to initialise this value before constructor
    }
    int a; // instance data member
}
class instanceinitializer {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        System.out.println(e1.a); //30
    }
}