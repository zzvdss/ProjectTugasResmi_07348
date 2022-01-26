package Model;
import Entity.SiswaEntity;
import Helper.KoneksiData;
import java.sql.*;
import java.util.ArrayList;
public class SiswaModel{
    private String sql;
    Connection conn = KoneksiData.getconection();
    public ArrayList<SiswaEntity> getDataSiswa(){
        ArrayList<SiswaEntity> DataSiswa = new ArrayList<>();
        try{
            Statement stat = conn.createStatement();
            sql = "SELECT * FROM siswa";
            ResultSet rs = stat.executeQuery(sql);
            while(rs.next()){
                SiswaEntity siswa =new SiswaEntity();
                siswa.setId(rs.getInt("id"));
                siswa.setNama(rs.getString("nama"));
                siswa.setAlamat(rs.getString("alamat"));
                siswa.setNoTelp(rs.getString("noTelp"));
                siswa.setPassword(rs.getString("password"));
                siswa.setJenisKelamin(rs.getString("jenisKelamin"));
                siswa.setKelas(rs.getString("kelas"));
                DataSiswa.add(siswa);
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        return DataSiswa;
    }
    
    public ArrayList<SiswaEntity> getDataSiswa(int id){
        ArrayList<SiswaEntity> DataSiswa = new ArrayList<>();
        try{
            Statement stat = conn.createStatement();
            sql = "SELECT * FROM siswa";
            ResultSet rs = stat.executeQuery(sql);
            while(rs.next()){
                SiswaEntity siswa =new SiswaEntity();
                siswa.setId(rs.getInt("id"));
                siswa.setNama(rs.getString("nama"));
                siswa.setAlamat(rs.getString("alamat"));
                siswa.setNoTelp(rs.getString("noTelp"));
                siswa.setJenisKelamin(rs.getString("jenisKelamin"));
                siswa.setKelas(rs.getString("kelas"));
                siswa.setPassword(rs.getString("password"));
                DataSiswa.add(siswa);
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        return DataSiswa;
    }


    public void insert(SiswaEntity siswa){
        try{
            sql = "INSERT INTO siswa (nama, alamat, noTelp, password, jeniskelamin, kelas) Values(?,?,?,?,?,?)";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, siswa.getNama());
            stat.setString(2, siswa.getAlamat());
            stat.setString(3, siswa.getNoTelp());
            stat.setString(4, siswa.getPassword());
            stat.setString(5, siswa.getJenisKelamin());
            stat.setString(6, siswa.getKelas());
            int rows = stat.executeUpdate();
            System.out.println(rows + "row(s) updated!");
        }catch (SQLException e) {
                System.out.println("GAGAL INPUT DATA!!!");
            e.printStackTrace();
        }
    }

    public void update(String nama, int id) {
        try {
            sql = "update siswa SET nama =? WHERE id =?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1,nama);
            stat.setInt(2, id);
            int rows = stat.executeUpdate();
            System.out.println(rows + "row(s) updated!");
        }catch (SQLException e) {
            System.out.println("GAGAL UPDATE NAMA!!!");
            e.printStackTrace();
        }
    }

    public void delete(int index){
        try{
            Statement stat = conn.createStatement();
            sql = "DELETE FROM siswa WHERE id = "+index;
            stat.execute(sql);
        }catch(SQLException e){
            System.out.println(e);
        }
    }

    public int cekLogin(String id, String password) {
        int cek = 0;
        try {
            sql = "SELECT * FROM siswa WHERE id =? and password=?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1,id);
            stat.setString(2,password);
            ResultSet rs = stat.executeQuery();
            if (rs.next()){
                cek = rs.getInt("id");
                String nama= rs.getString("nama");
                System.out.println("Selamat Datang"+ nama);
            }else{
                cek = 0;
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return cek;
    }
}
