// class Employee{
//     int empid;
//     String empname;
//     Employee(int i, String n){
//         this.empid=i;
//         this.empname=n;
//     }

// }
// class test{
//     public static void main(String[] args) {
//         Employee obj=new Employee(100, "raja");
//         System.out.println(obj); //calls the toString() method of Object class
//                                  // which returns the address
//     }
// }


// class Employee{
//     int empid;
//     String empname;
//     Employee(int i, String n){
//         this.empid=i;
//         this.empname=n;
//     }
//     @Override
//     public String toString(){
//         return this.empid+" "+this.empname;
//     }

// }
// class test{
//     public static void main(String[] args) {
//         Employee obj=new Employee(100, "raja");
//         System.out.println(obj); //calls the toString() method of Object class
//                                  // which returns the address, but if we override, we can customise the toStrring() method
//     }
// }


// class Employee{
//     int empid;
//     String empname;
//     Employee(int i, String n){
//         this.empid=i;
//         this.empname=n;
//     }
//     @Override
//     public boolean equals(Object k){
//         if(this.getClass().getName().equals(k.getClass().getName())){
//             Employee kk=(Employee)k;
//             if(this.empid==kk.empid && this.empname.equals(kk.empname))
//             {
//                 return true;
//             }else{
//                 return false;
//             }
//         }else{
//             return false;
//         }
//     }
   

// }
// class test{
//     public static void main(String[] args) {
//         Employee e1=new Employee(100, "raja");
//         Employee e2=new Employee(100, "raja");
//         System.out.println(e1.equals(e2));
//     }
// }


// class Employee{
//     int empid;
//     String empname;
//     Employee(int i, String n){
//         this.empid=i;
//         this.empname=n;
//     }
        
    

// }
// class test{
//     public static void main(String[] args) {
//         Employee e1=new Employee(100, "raja");
//         Employee e2=new Employee(100, "raja");
//         System.out.println(e1.hashCode());
//         System.out.println(e2.hashCode());
//         // returns different codes, but we can always return the same codes using override methods.
//     }
// }


class Car implements Cloneable { //class Car implements from an Object interface Cloneable
    String Brand;
    Car(String b){   //constructor is used
        this.Brand=b;
    }
    @Override //clone method is used to override and to return the duplicate object
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();

    }
}

class test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Car c1=new Car("Volkswagen");
        Car c2=(Car)c1.clone();
        System.out.println(c2.Brand);  //Volkswagen
        
    }
}













