class Box<T> {
    T i;

    Box(T i) //or void set(T i)
    {
        this.i = i;
    }

    T get() {
        return this.i;
    }

}

class test {
    public static void main(String[] args) {
        Box<Integer> obj = new Box<Integer>(100);
        // or
        // Box<Integer> obj = new Box<Integer>();
        // obj.set(100);

        System.out.println(obj.get());

    }
}




// class Box<K,V>{
// private K key;
// private V value;
// Box(K key, V value){
// this.key=key;
// this.value=value;
// }
// public K getKey(){
// return this.key;
// }
// public V getValue(){
// return this.value;
// }
// }
// class test{
// public static void main(String[] args) {
// Box<String, Integer> obj=new Box<>("Subham", 100);
// System.out.println(obj.getKey()+" "+obj.getValue());
// }
// }





// class Box<T> { // <T extends Number> restricts to Number types
// T i;

// void set(T i) {
// this.i = i;
// }

// T get() {
// return this.i;
// }

// }

// class test {
// public static void main(String[] args) {
// Box<Integer> a = new Box<Integer>();
//
// a.set(100);
// System.out.println(a.get());

// Box<String> b = new Box<String>();
//
// b.set("Raja");
// System.out.println(b.get());

// }
// }