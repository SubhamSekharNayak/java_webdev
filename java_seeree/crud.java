class Employee {
    int empid;

}
 class crud {
    public static void main(String[] args) {
        Employee e1 = new Employee (); //create
        System.out.println(e1.empid);  //read - output is 0
        e1.empid = 33; //update
        System.out.println(e1.empid); //read - output is 33
    }
 }