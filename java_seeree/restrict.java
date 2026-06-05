class Volumn {
    final int max = 100;
    final int min = 0;

}
class restrict {
    public static void main(String[] args) {
        Volumn v = new Volumn ();
        // v.max = 0;   // order is wrong
        // v.min = 100; // order is wrong
        System.out.println(v.max);
        System.out.println(v.min);
        
    }
}