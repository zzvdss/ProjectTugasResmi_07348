package Model;

import Controller.AllObjectModel;
import Entity.DaftarEntity;
import Helper.KoneksiDb;
import java.sql.*;
import java.util.ArrayList;
public class DaftarModel {
    private String sql;
    public Connection conn = KoneksiDb.getconection();
    private ArrayList<DaftarEntity> daftarArrayList = new ArrayList<>();
    
    public ArrayList<DaftarEntity> getDaftarKursus(){
        try{
            Statement stat = conn.createStatement();
            sql = "SELECT * FROM siswa";
            ResultSet rs = stat.executeQuery(sql);
            while(rs.next()){
                
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        return daftarArrayList;
    }
    
    public ArrayList<DaftarEntity> cekData(int id){
        try{
            Statement stat = conn.createStatement();
            sql = "SELECT * FROM petugas";
            ResultSet rs = stat.executeQuery(sql);
            while(rs.next()){

            }
        }catch(SQLException e){
            System.out.println(e);
        }
        return daftarArrayList;
    }

    public void Updateverif(int id) {
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
}
