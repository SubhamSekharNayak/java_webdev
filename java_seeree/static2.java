class Employee {
    static String compname;
    static{
        compname="seeree";
        System.out.println("static block is invoked first");
    }

}
class static2 {
    public static void main(String[] args) {
        System.out.println("hello main "+Employee.compname); //seeree
}
}