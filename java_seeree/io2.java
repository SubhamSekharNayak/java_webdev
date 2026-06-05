// import java.io.*;

// public class io2 {
//     public static void main(String[] args) throws Exception {

//         FileReader fr=new FileReader("seeree.txt");

//         // int i=fr.read();
//         // System.out.println((char)i);
//         // fr.close();

//         // int i;
//         // while((i=fr.read())!=-1)
//         // System.out.print((char)i);
//         // fr.close();

//          FileWriter fw=new FileWriter("seeree.txt");
//             fw.write("my name is subhamiii");
//             fw.flush();
//             fw.close();
//     }
// }

// import java.io.*;

// public class io2 {
//     public static void main(String[] args) {

//         try{
//             FileWriter fw=new FileWriter("seeree.txt");
//             fw.write("my name is subham");
//             fw.flush();
//             fw.close();
//         }catch(Exception e){
//             System.out.println(e);
//         }
//         System.out.println("success");

//     }
// }

// import java.io.*;

// public class io2 {
//     public static void main(String[] args) throws Exception {

//         FileOutputStream fout = new FileOutputStream("seeree.txt");
//         BufferedOutputStream bout = new BufferedOutputStream(fout);
//         String s = "Dhoni is not my favourite player....";
//         byte b[] = s.getBytes();
//         bout.write(b);
//         bout.flush();
//         bout.close();
//         FileReader fr = new FileReader("seeree.txt");
//         int i;
//         while ((i = fr.read()) != -1)
//             System.out.print((char) i);
//         fr.close();

//     }
// }

// import java.io.*;

// public class io2 {
//     public static void main(String[] args) {
//         try {
//             FileInputStream fin = new FileInputStream("seeree.txt");
//             BufferedInputStream bin = new BufferedInputStream(fin);
//             int i;
//             while ((i = bin.read()) != -1)
//                 System.out.print((char) i);
//             fin.close();
//         } catch (Exception e) {
//             System.out.println(e);
//         }
//     }
// }


// import java.io.*;

// public class io2 {
//     public static void main(String[] args) throws Exception {

//         FileInputStream fin = new FileInputStream("seeree.txt");
//         BufferedInputStream bin = new BufferedInputStream(fin);
//         int i;
//         while ((i = bin.read()) != -1)
//             System.out.print((char) i);
//         fin.close();

//     }
// }




// //sequenceinputstream
// import java.io.*;
// public class io2{
//     public static void main(String[] args) throws Exception{
//         FileInputStream fin1=new FileInputStream("seeree.txt");
//         FileInputStream fin2=new FileInputStream("raja.txt");
//         SequenceInputStream sis=new SequenceInputStream(fin1, fin2);
//         int i;
//         while((i=sis.read())!=-1){
//             System.out.print((char)i);
//         }
//         // sis.close();

//     }
// }




// //bufferedreaderclass
// import java.io.*;

// public class io2 {
//     public static void main(String[] args) throws Exception {
//         FileReader fr = new FileReader("raja.txt");
//         BufferedReader br = new BufferedReader(fr);
//         String line;
//         while ((line = br.readLine()) != null) {
//             System.out.println(line);
//         }
//         br.close();

//     }
// }




//try-with-resources
import java.io.*;
public class io2{
    public static void main(String[] args) {
        try{
            BufferedReader reader=new BufferedReader(new FileReader("seeree.txt"));
            String line;
            while((line=reader.readLine())!=null){
                System.out.println(line);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
//reader is automatically closed here