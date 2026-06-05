class Utility {
    // Generic Method
    public static <T> void printData(T data) {
        System.out.println("Data: "+ data);
    }
}

class test{
    public static void main(String[] args) {
        Utility.printData(100);
        Utility.printData("Raja");
        Utility.printData(14554.25);
    }
}