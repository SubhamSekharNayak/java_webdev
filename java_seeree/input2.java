import java.io.*;

class test {
    public static void main(String[] args) throws Exception {
        System.out.println("enter a password:");
        Console c = System.console();
        char[] pwd = c.readPassword();
        for (char ch : pwd) {
            System.out.println(ch);
        }
    }
}
