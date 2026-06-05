import java.io.*;

class test {
    public static void main(String[] args) throws Exception {
        // InputStreamReader isr = new InputStreamReader(System.in);
        // BufferedReader br = new BufferedReader(isr);

        //OR
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter your name:");
        String name = br.readLine();
        System.out.println("Welcome " + name);

    }
}