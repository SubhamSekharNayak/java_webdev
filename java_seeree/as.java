class Employee {
    private int empid=100;
    void show()
    {
        System.out.println(this.empid);  //100
    }
}

class test {
    public static void main(String[] args) {
        Employee obj=new Employee();
        // System.out.println(obj.empid);  //error (because private attribute can't be accessed outside the class)
        obj.show();
    }
}