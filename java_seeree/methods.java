class Employee
{
    void show()
    {
        int r = 0; //statement
        r = 10 + 20; //expression consists of operand and operator
        System.out.println(r); //statement
    }
}
class methods {
    public static void main(String[] args) {
        Employee obj = new Employee();
        obj.show();
    }
}