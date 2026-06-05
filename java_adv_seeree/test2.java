// import java.sql.*;

// // import java.util.Scanner;
// public class test2 {
//     public static void main(String[] args) {
//         try {
//             Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/education_sys", "root", "");
//             System.out.println("success....");
//         } catch (Exception e) {
//             System.out.println(e.getMessage());
//         }
//     }
// }

// import java.sql.*;

// public class test2 {
//     public static void main(String[] args) {
//         try {
//             Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/education_sys", "root", "");
//             Statement stmt = con.createStatement();
//             stmt.executeUpdate("insert into stu values(88, 'bun')");
//             System.out.println("success....");
//         } catch (Exception e) {
//             System.out.println(e.getMessage());
//         }
//     }
// }

// import java.sql.*;

// public class test2 {
//     public static void main(String[] args) {
//         try {
//             Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/education_sys", "root", "");
//             Statement stmt = con.createStatement();
//             ResultSet rs = stmt.executeQuery("select * from stu");
//             rs.next(); //move cursor to 1st row
//             System.out.println(rs.getInt(1) + " | " + rs.getString(2)); //dispalying 1st and 2nd column of 1st row
//             rs.next(); //move cursor to 2nd row
//             System.out.println(rs.getInt(1) + " | " + rs.getString(2)); //displaying 1st and 2nd column of 2nd row

//         } catch (Exception e) {
//             System.out.println(e.getMessage());
//         }
//     }
// }

// import java.sql.*;

// public class test2 {
//     public static void main(String[] args) {
//         try {
//             Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/education_sys", "root", "");
//             PreparedStatement pstmt = con.prepareStatement("insert into stu values(?, ?)");
//             pstmt.setInt(1, 44);
//             pstmt.setString(2, "bunner");
//             pstmt.executeUpdate();

//             System.out.println("success....");
//         } catch (Exception e) {
//             System.out.println(e.getMessage());
//         }
//     }
// }

// import java.sql.*;

// public class test2 {
//     public static void main(String[] args) {
//         try {
//             Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/education_sys", "root", "");
//             con.setAutoCommit(false);
//             PreparedStatement pstmt = con.prepareStatement("insert into stu values(?, ?)");
//             pstmt.setInt(1, 477);
//             pstmt.setString(2, "hello");
//             pstmt.executeUpdate();
//             con.commit();
//             System.out.println("success....");
//         } catch (Exception e) {
//             System.out.println(e.getMessage());
//         }
//     }
// }

// import java.sql.*;

// public class test2 {
//     public static void main(String[] args) {
//         try {
//             Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/education_sys", "root", "");
//             con.setAutoCommit(false);
//             Statement pstmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
//             ResultSet rs = pstmt.executeQuery("select * from stu");
//             rs.next();
//             System.out.println(rs.getString(2)); // Raja
//             rs.next();
//             System.out.println(rs.getString(2)); // Aja
//             rs.next();
//             System.out.println(rs.getString(2)); // bun
//             rs.previous();
//             System.out.println(rs.getString(2)); // Aja

//         } catch (Exception e) {
//             System.out.println(e.getMessage());
//         }
//     }
// }

// import java.sql.*;

// public class test2 {
//     public static void main(String[] args) {
//         try {
//             Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/education_sys", "root", "");
//             con.setAutoCommit(false);
//             Statement pstmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
//             ResultSet rs = pstmt.executeQuery("select * from stu");
//             rs.next();
//             System.out.println(rs.getString(2)); // Raja
//             rs.relative(2);
//             System.out.println(rs.getString("name"));
//             rs.next();
//             System.out.println(rs.getString(2));
//             rs.next();
//             System.out.println(rs.getString(2));

//         } catch (Exception e) {
//             System.out.println(e.getMessage());
//         }
//     }
// }

import java.sql.*;

public class test2 {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/education_sys", "root", "");
            String sql = "insert into stu (roll, name) values(?, ?)";
            PreparedStatement pstmt = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            pstmt.setInt(1, 90);
            pstmt.setString(2, "prasan");
            pstmt.executeUpdate();

            ResultSet rs = pstmt.getGeneratedKeys();
            if (rs.next()) {
                int generatedId = rs.getInt(1);
                System.out.println("Inserted Id: " + generatedId);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
