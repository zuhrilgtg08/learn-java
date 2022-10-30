import java.sql.*;
public class Koneksi {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            String username = "root";
            String password = "";
            Connection koneksi = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/coba_java",
                username, 
                password
            );
            System.out.println("berhasil");
        } catch (SQLException | InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            System.out.print(e);
        }
    }
}
