package Helper;

import java.sql.Connection;
import java.sql.DriverManager;
public class KoneksiDb {
    public static Connection getconection(){
        Connection conn = null;
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/kursus";
        String user = "root";
        String password = "";
        try{
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Berhasil Koneksi Databases");
        }catch(Exception e){
            System.out.println("Gagal Koneksi Databases");
            e.printStackTrace();
        }
        return conn;
    }
}
