class Calc 
{
    int Add(int i, int j) //1. declare , 2. take some parameters
    {
        int r = i+j; //3. process it
        return r; //4. return a value
    }
}
class methods2 {
    public static void main(String[] args) {
        Calc obj = new Calc();
        int result = obj.Add(100,200); //5. call by assigning arguments , 6. return value by assigning to a new variable
        System.out.println(result);
    }
}