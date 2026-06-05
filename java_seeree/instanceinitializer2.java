class instanceinitializer2{
    {
        System.out.println("hello non-static block"); //invoked before constructor

    }
    instanceinitializer2()
    {
        System.out.println("constructor");
    }
    public static void main(String[] args) {
        instanceinitializer2 obj = new instanceinitializer2();
    }
}
