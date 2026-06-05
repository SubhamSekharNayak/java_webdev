// import java.sql.*;

// class test {
//     public static void main(String[] args) throws Exception {
//         Class.forName("com.mysql.cj.jdbc.Driver");

//         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "");
//         if (con != null) {
//             System.out.println("Connection Successful....");
//         }

//     }
// }









import java.sql.*;

class test {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/education_sys", "root", "");

        PreparedStatement ps = con.prepareStatement("insert into stu(roll, name, age) values(?,?,?)");
        ps.setInt(1, 102);
        ps.setString(2, "Aja");
        ps.setInt(3, 22);
        ps.executeUpdate();
        System.out.println("Data Inserted successfully");
        con.close();

    }
}
