package Controller;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class KoneksiDb {
    public static Statement stmt = null;
    public static ResultSet rs;
    
    public static Connection getconnection(){
        Connection conn = null;
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/db_gudangsepatu";  
        String user = "root";
        String pass = "";
        
        
        try{
            Class.forName(driver);                              
            conn = DriverManager.getConnection(url,user,pass);  
            stmt = conn.createStatement();
            System.out.println("Berhasil Koneksi database");
        }catch(Exception e){    
            System.out.println("Gagal Koneksi database");
            e.printStackTrace();  
        }
        return conn;
    }
}