package Model;

import Entity.PetugasEntity;
import Helper.KoneksiDb;
import java.sql.*;
import java.util.ArrayList;
public class PetugasModel{
    private String sql;
    public Connection conn = KoneksiDb.getconection();
    private ArrayList<PetugasEntity> DataPetugas = new ArrayList<>();
    
    public void insert(PetugasEntity PetugasEntity){
        try {
            String sql = "INSERT INTO petugas (nama, alamat, noTelp, password, petugaskelas) VALUES (?, ?, ?, ?, ?);";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, PetugasEntity.getnama());
            stat.setString(2, PetugasEntity.getalamat());
            stat.setString(3, PetugasEntity.getnoTelp());
            stat.setString(4, PetugasEntity.getpassword());
            stat.setString(5, PetugasEntity.getpetugaskelas());
            int rows = stat.executeUpdate();
            System.out.println(rows + "row(s) updated!");
        } catch (SQLException e) {
            System.out.println("Gagal Input Data!!!");
            e.printStackTrace();
        } 
    }
    
    public void update(String password, int id) {
        try {
            sql = "update petugas SET password =? WHERE id =?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1,password);
            stat.setInt(2, id);
            stat.executeUpdate();
        }catch (SQLException e) {
            System.out.println("GAGAL RUBAH PASSWORD!!!");
            e.printStackTrace();
        }
    }
    
    public void deleteData(int index) {
        try {
            sql = "DELETE FROM siswa WHERE id =?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setInt(1, index);
            stat.executeUpdate();
        } catch (SQLException e) {
            System.err.println("GAGAL HAPUS DATA");
            e.printStackTrace();
        }
    }
    
     public void verifsiswa(int id){
        try {
            sql = "update siswa SET status = 1 WHERE id =?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setInt(1, id);
            int rows = stat.executeUpdate();
            System.out.println(rows + "row(s) updated!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public int login(String nama, String password) {
        int cek = 0;
        try {
            sql = "SELECT * FROM petugas WHERE nama =? and password=?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, nama);
            stat.setString(2, password);
            ResultSet rs = stat.executeQuery();
            if (rs.next()){
                cek = rs.getInt("id");
            }else{
                cek = 0;
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return cek;
    }
}
