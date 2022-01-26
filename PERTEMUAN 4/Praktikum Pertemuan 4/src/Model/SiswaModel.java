package Model;

import Entity.SiswaEntity;
import java.sql.*;
import java.util.ArrayList;

public class SiswaModel extends DaftarModel {
    private String sql;
    
    public ArrayList<SiswaEntity> getsiswa(){ //get>siswa mengambil dta siswa dri database
        ArrayList<SiswaEntity> arraylistSiswa = new ArrayList<>();
        try {
            Statement stat = conn.createStatement();
            sql = "SELECT * FROM siswa";
            ResultSet rs = stat.executeQuery(sql);
            while(rs.next()) {
                SiswaEntity siswaEntity = new SiswaEntity();
                siswaEntity.setid(rs.getInt("id"));
                siswaEntity.setnama(rs.getString("nama"));
                siswaEntity.setalamat(rs.getString("alamat"));
                siswaEntity.setnoTelp(rs.getString("noTelp"));
                siswaEntity.setpassword(rs.getString("password"));
                siswaEntity.setjeniskelamin(rs.getString("jeniskelamin"));
                siswaEntity.setkelas(rs.getString("kelas"));
                siswaEntity.setstatus(rs.getInt("status"));
                arraylistSiswa.add(siswaEntity);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return arraylistSiswa; 
    }
    
    public ArrayList<SiswaEntity> getSiswa(int id){
        ArrayList<SiswaEntity> arrSiswa = new ArrayList<>();
        try {
            sql = "SELECT * FROM siswa where id =?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setInt(1, id);
            ResultSet rs = stat.executeQuery();
            while(rs.next()){
                SiswaEntity siswaEntity = new SiswaEntity();
                
                siswaEntity.setid(rs.getInt("id"));
                siswaEntity.setnama(rs.getString("nama"));
                siswaEntity.setpassword(rs.getString("password"));
                siswaEntity.setnoTelp(rs.getString("noTelp"));
                siswaEntity.setalamat(rs.getString("alamat"));
                siswaEntity.setjeniskelamin(rs.getString("jeniskelamin"));
                siswaEntity.setkelas(rs.getString("kelas"));
                siswaEntity.setstatus(rs.getInt("status"));
                arrSiswa.add(siswaEntity);
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }return arrSiswa;
    }
    
    public void insertData(SiswaEntity SiswaEntity) {
        try {
            sql = "INSERT INTO siswa (nama, password, noTelp, alamat, jeniskelamin, kelas) Values(?,?,?,?,?,?)";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, SiswaEntity.getnama());
            stat.setString(2, SiswaEntity.getpassword());
            stat.setString(3, SiswaEntity.getnoTelp());
            stat.setString(4, SiswaEntity.getalamat());
            stat.setString(5, SiswaEntity.getjeniskelamin());
            stat.setString(6, SiswaEntity.getkelas()); 
                    
            int rows = stat.executeUpdate();
            System.out.println(rows + "row(s) updated!");
        } catch (SQLException e) {
            System.out.println("GAGAL INPUT DATA!!!");
            e.printStackTrace();
        }
    }
    
    public void updatenama(String nama, int id){
        try{
            sql = "update siswa SET nama =? WHERE id =?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, nama);
            stat.setInt(2, id);
            stat.executeUpdate();
        } catch (SQLException e){
            System.err.println("GAGAL RUBAH NAMA!!!");
            e.printStackTrace();
        }
    }
    
    public void updatepassword(String password, int id){
        try{
            sql = "update siswa SET password =? WHERE id =?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, password);
            stat.setInt(2, id);
            int rows = stat.executeUpdate();
            System.out.println(rows + "row(s) updated!");
        } catch (SQLException e){
            System.err.println("GAGAL RUBAH PASSWORD");
            e.printStackTrace();
        }
    }
    
    public void updatenoTelp(String noTelp, int id){
        try{
            sql = "update siswa SET noTelp =? WHERE id =?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, noTelp);
            stat.setInt(2, id);
            int rows = stat.executeUpdate();
            System.out.println(rows + "row(s) updated!");
        } catch (SQLException e){
            System.err.println("GAGAL RUBAH NOMOR TELP!!!");
            e.printStackTrace();
        }
    }
    
    public void updatealamat(String alamat, int id){
        try{
            sql = "update siswa SET alamat =? WHERE id =?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, alamat);
            stat.setInt(2, id);
            int rows = stat.executeUpdate();
            System.out.println(rows + "row(s) updated!");
        } catch (SQLException e){
            System.err.println("GAGAL RUBAH ALAMAT");
            e.printStackTrace();
        }
    }
    
    public void updatejeniskelamin(String jeniskelamin, int id){
        try{
            sql = "update siswa SET jeniskelamin =? WHERE id =?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, jeniskelamin);
            stat.setInt(2, id);
            int rows = stat.executeUpdate();
            System.out.println(rows + "row(s) updated!");
        } catch (SQLException e){
            System.err.println("GAGAL RUBAH JENIS KELAMIN");
            e.printStackTrace();
        }
    }
    
    public void updatekelas(String kelas, int id){
        try{
            sql = "update siswa SET kelas =? WHERE id =?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, kelas);
            stat.setInt(2, id);
            int rows = stat.executeUpdate();
            System.out.println(rows + "row(s) updated!");
        } catch (SQLException e){
            System.err.println("GAGAL RUBAH Kelas");
            e.printStackTrace();
        }
    }
    
     public int ceklogin(String nama, String password){
        int cek = 0;
        try{
            sql = "SELECT * FROM siswa where nama = ? and password = ?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, nama);
            stat.setString(2, password);
            ResultSet rs = stat.executeQuery();
            if(rs.next()){
                cek = rs.getInt("id");
                System.out.println("Selamat Datang " + nama);
            } else {
                cek = 0;
            }
        } catch (SQLException e){
            e.printStackTrace();
        } return cek;
    }
    
    public int verif(int id){
        int verif = 0;
        try {
            sql = "SELECT * FROM siswa where id =?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setInt(1, id);
            ResultSet rs = stat.executeQuery();
            
            if(rs.next()){
               verif = rs.getInt("status");
            } else {
                verif = 0;
            }
        } catch (Exception e){
            e.printStackTrace();
        } return verif;
   }
}