/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasDatabase;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;

/**
 *
 * @author Lenovo
 */
public class tugasDatabase {
    public static void main(final String[] args) throws ClassNotFoundException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            String username = "root";
            String password = "";
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_latihan_pbo", username, password);
            Statement stmt = koneksi.createStatement();
                String sqlCreate = "INSERT INTO siswa(nama, jurusan, alamat, nilai) VALUES ('Dimas Firmansyah', 'RPL', 'JL Gadukan 24/8', 90.5)";
//                String sqlUpdate = "UPDATE siswa SET jurusan='TEDK' WHERE id=3";
//                String sqlDelete = "DELETE FROM siswa WHERE id=3";
//            stmt.executeUpdate(sqlDelete);
            stmt.executeUpdate(sqlCreate);
//            stmt.executeUpdate(sqlUpdate);
        } catch (SQLException | InstantiationException | IllegalAccessException | ClassNotFoundException ex) {
            System.out.println(ex);
        }
    }
}
