// import java.sql.*;

// public class test4 {
//     public static void main(String[] args) {
//         try {
//             Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/education_sys", "root", "");
//             CallableStatement cstmt = con.prepareCall("{call ins_stu(?, ?)}");

//             cstmt.setInt(1, 900);
//             cstmt.setString(2, "prabin");

//             cstmt.execute();

//         } catch (Exception e) {
//             System.out.println(e.getMessage());
//         }
//     }
// }



// import java.sql.*;

// public class test4 {
//     public static void main(String[] args) {
//         try {
//             Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/education_sys", "root", "");
//             CallableStatement cstmt = con.prepareCall("{call show_stu}");

//             ResultSet rs = cstmt.executeQuery();
//             rs.next();
//             System.out.println(rs.getString(3));

//         } catch (Exception e) {
//             System.out.println(e.getMessage());
//         }
//     }
// }





import java.sql.*;

public class test4 {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/education_sys", "root", "");
            CallableStatement cstmt = con.prepareCall("{call deletee_stu(?)}");
            cstmt.setInt(1, 900);
            cstmt.execute();

            

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}