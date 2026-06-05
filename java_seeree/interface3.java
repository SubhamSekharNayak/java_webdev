interface Vehicle {
    static void info(){
        System.out.println("All vehicles have engines.");
    }
}
class test {
    public static void main(String[] args) {
        Vehicle.info();
    }
}