class Employee {
    Employee()
    {
        System.out.println("Constructor..."); //gets executed after the instance initialization block
    }
    {
        System.out.println("non static block 10"); //instance initialization(non - static)block
    }
    {
       System.out.println("non static block 1");
    }

}
class nonstatic {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee(); //gets executed twice if we create 2 objects
        new Employee();
    }
}