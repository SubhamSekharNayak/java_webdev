// import java.sql.*;

// public class test3 {
//     public static void main(String[] args) {
//         try {
//             Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/education_sys", "root", "");
//             Statement stmt = con.createStatement();
//             ResultSet rs = stmt.executeQuery("select * from stu");
//             ResultSetMetaData rsmd = rs.getMetaData();
//             System.out.println(rsmd.getColumnCount()); // 3
//             System.out.println(rsmd.getColumnLabel(3)); // slno
//             System.out.println(rsmd.getColumnType(1)); // 4
//             System.out.println(rsmd.getColumnTypeName(1)); // int
//             System.out.println(rsmd.getPrecision(3)); // 30
//             System.out.println(rsmd.getColumnName(3));
//             System.out.println(rsmd.getTableName(1));
//             System.out.println(rsmd.getSchemaName(1));
//         } catch (Exception e) {
//             System.out.println(e.getMessage());
//         }
//     }
// }

// import java.sql.*;

// public class test3 {
//     public static void main(String[] args) {
//         try {
//             Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/education_sys", "root", "");
//             Statement stmt = con.createStatement();
//             DatabaseMetaData dbmd = con.getMetaData();
//             System.out.println(dbmd.getDatabaseProductName());
//             System.out.println(dbmd.getClass());
//             System.out.println(dbmd.getDriverName());
//             System.out.println(dbmd.getUserName());
//             System.out.println(dbmd.getMaxRowSize());
//             System.out.println(dbmd.getMaxColumnsInTable());
//             System.out.println(dbmd.getAttributes(null, null, null, null));
//         } catch (Exception e) {
//             System.out.println(e.getMessage());
//         }
//     }
// }



import java.sql.*;

public class test3 {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/education_sys", "root", "");
            Statement stmt = con.createStatement();
            DatabaseMetaData dbmd = con.getMetaData();
            String table[]={"VIEW"};
            ResultSet rs=dbmd.getTables(null, null, null, table);
            while(rs.next())
            {
                System.out.println(rs.getString(3));
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}