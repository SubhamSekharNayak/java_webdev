interface Vehicle {
    // void start(); //abstract method
   
    default void fuelType(){
        System.out.println("Default fuel is petrol.");
    }
}
class car implements Vehicle {
    
    public void start(){
        System.out.println("car starting...");
    }
}
class car2 extends car {
    public void end(){
        System.out.println("fuel is not gonna end...");
    }

    public static void main(String[] args) {
        car2 c = new car2();
        c.end();
        c.start();
        c.fuelType();
    }
}
