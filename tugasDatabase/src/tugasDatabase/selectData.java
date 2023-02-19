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
import java.sql.ResultSet;
import java.util.Date;
import java.sql.*;
/**
 *
 * @author Lenovo
 */
public class selectData {
    public static void main(final String[] args) throws ClassNotFoundException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            String username = "root";
            String password = "";
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_latihan_pbo", username, password);
            Statement stmt = koneksi.createStatement();
                String sqlSelect = "SELECT * FROM siswa";
                ResultSet result = stmt.executeQuery(sqlSelect);
                while(result.next()) {
                    String nama = result.getString("nama");
                    String jurusan = result.getString("jurusan");
                    String alamat = result.getString("alamat");
                    Float nilai = result.getFloat("nilai");
                    System.out.println("Nama            : " + nama);
                    System.out.println("Jurusan         : " + jurusan);
                    System.out.println("Alamat          : " + alamat);
                    System.out.println("Nilai           : " + nilai);
                    System.out.println("=======================================");
                }
        } catch (SQLException | InstantiationException | IllegalAccessException | ClassNotFoundException ex) {
            System.out.println(ex);
        }
    }
}
