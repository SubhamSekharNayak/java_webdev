// import java.io.*;
// class test {
//     public static void main(String[] args) throws Exception {
//         File f=new File("raja.txt");
//         // f.createNewFile();
//         if(f.exists()){
//             System.out.println("available");
//         }else{
//             System.out.println("not available");
//         }
//     }
// }


// import java.io.*;
// import java.util.*;


import java.io.File;
import java.io.IOException;

class test {
    public static void main(String[] args) throws IOException {

        // File f = new File("C:\\Users\\SUBHAM\\Downloads\\JAVA SEEREE\\input2.java");
        // System.out.println(f.getParent());
        // System.out.println(f.isFile());
        // System.out.println(f.isHidden());

        // System.out.println(f.length());
        // System.out.println(f.isDirectory());
        // System.out.println(f.lastModified());
        // long timestamp = f.lastModified();
        // Date date = new Date(timestamp);
        // System.out.println(date);

        File f1=new File("C:\\Users\\SUBHAM\\Downloads\\JAVA SEEREE\\");
        // System.out.println(f1.createNewFile());
        // System.out.println(f1.isFile());
        // System.out.println(f1.isDirectory());
        // System.out.println(f1.length());
        // System.out.println(f1.getName());
        // System.out.println(f1.getPath());
        // System.out.println(f1.getParent());
        System.out.println(f1.exists());
        // System.out.println(f1.canRead());
        // System.out.println(f1.canWrite());
        System.out.println(f1.mkdir());
        f1.delete();






    }
}