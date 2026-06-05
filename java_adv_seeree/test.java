// import java.sql.*;
// public class test {
//     public static void main(String[] args) {
//         try{

//             DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "");
//             System.out.println("connection success");

//         }catch(Exception e) {
//             System.out.println((e.getMessage()));
//         }
//     }
// }

//creating database 
// import java.sql.*;

// public class test {
//     public static void main(String[] args) {
//         try {

//             Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "");
//             Statement stmt = con.createStatement();
//             stmt.executeUpdate("create database education_sys");
//             System.out.println("connection success");

//         } catch (Exception e) {
//             System.out.println((e.getMessage()));
//         }
//     }
// }

//creating table
// import java.sql.*;

// public class test {
//     public static void main(String[] args) {
//         try {

//             Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/education_sys", "root", "");
//             Statement stmt = con.createStatement();
//             stmt.executeUpdate("create table stu(roll int, name varchar(30))");
//             System.out.println("connection success");

//         } catch (Exception e) {
//             System.out.println((e.getMessage()));
//         }
//     }
// }

//inserting data
// import java.sql.*;

// public class test {
//     public static void main(String[] args) {
//         try {

//             Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/education_sys", "root", "");
//             Statement stmt = con.createStatement();
//             stmt.executeUpdate("delete from stu where 1=1");
//             System.out.println("connection successful");

//         } catch (Exception e) {
//             System.out.println((e.getMessage()));
//         }
//     }
// }

// import java.sql.*;
// public class test{
//     public static void main(String[] args) {
//         try{
//             Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/education_sys", "root", "");
//             Statement stmt=con.createStatement();
//             ResultSet rs=stmt.executeQuery("select * from stu");
//             rs.next(); //move the cursor
//             System.out.println(rs.getInt(1)+" | "+rs.getString(2));   //return the roll & name of stu from 1st row
//             rs.next(); //move the cursor
//             System.out.println(rs.getInt(1)+" | "+rs.getString(2));   //return the roll & name of stu from 2nd row
//         }catch(Exception e){
//             System.out.println(e.getMessage());
//         }

//     }
// }




import java.sql.*;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/education_sys", "root", "");
            Statement stmt = con.createStatement();
            System.out.println("Enter i for Insert, stop to Exit, s for Select, u for Update & d for Delete");
            Scanner sc = new Scanner(System.in);
            String info = sc.next().toLowerCase();
            int roll;
            String name;
            while (!info.equals("stop")) {
                switch (info) {
                    case "i":
                        System.out.println("Enter roll and name");
                        roll = sc.nextInt();
                        name = sc.next();
                        stmt.executeUpdate("insert into stu values(" + roll + ", '" + name + "')");
                        break;
                    case "u":
                        System.out.println("Enter roll to be updated");
                        roll = sc.nextInt();
                        System.out.println("Enter new name of " + roll + " to be updated");
                        name = sc.next();
                        stmt.executeUpdate("update stu set name='" + name + "' where roll=" + roll);
                        break;
                    case "d":
                        System.out.println("Enter roll to be deleted");
                        roll = sc.nextInt();
                        stmt.executeUpdate("delete from stu where roll=" + roll);
                        break;
                    case "s":
                        ResultSet rs = stmt.executeQuery("select * from stu");
                        while (rs.next()) {
                            System.out.println(rs.getInt(1) + " | " + rs.getString(2));
                        }
                        break;
                    default:

                }
                System.out.println("Enter i for Insert, stop to Exit, s for Select, u for Update & d for Delete");
                info = sc.next().toLowerCase();

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }
}