package Model;
import Entity.GudangEntity;
import Controller.KoneksiDb;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class GudangModel extends SepatuModelAbstract{
    private String sql;

    public ArrayList<GudangEntity> getstash(){
        ArrayList<GudangEntity> arrayliststash = new ArrayList<>();
        try {
            Statement stat = conn.createStatement();
            sql = "SELECT * FROM stash";
            ResultSet rs = stat.executeQuery(sql);
            while(rs.next()) {
                GudangEntity gudangEntity = new GudangEntity() {};
                gudangEntity.setId(rs.getInt("id"));
                gudangEntity.setMerek(rs.getString("merek"));
                gudangEntity.setSize(rs.getString("size"));
                gudangEntity.setPcs(rs.getString("pcs"));
                arrayliststash.add(gudangEntity);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return arrayliststash;
    }

    public ArrayList<GudangEntity> getstash(int id){
        ArrayList<GudangEntity> arrstash = new ArrayList<>();
        try {
            sql = "SELECT * FROM stash where id =?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, id);
            ResultSet rs = stat.executeQuery();
            while(rs.next()){
                GudangEntity gudangEntity = new GudangEntity() {};
                gudangEntity.setId(rs.getInt("id"));
                gudangEntity.setMerek(rs.getString("merek"));
                gudangEntity.setSize(rs.getString("size"));
                gudangEntity.setPcs(rs.getString("pcs"));
                arrstash.add(gudangEntity);
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }return arrstash;
    }

    public void insert(GudangEntity gudangEntity) {
        try {
            sql = "INSERT INTO stash (merek, size, pcs) Values(?,?,?)";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, gudangEntity.getId());
            stat.setString(2, gudangEntity.getMerek());
            stat.setString(3, gudangEntity.getSize());
            stat.setString(4, gudangEntity.getPcs());
            int rows = stat.executeUpdate();
            System.out.println(rows + "row(s) updated!");
        } catch (SQLException e) {
            System.out.println("GAGAL INPUT DATA!!!");
            e.printStackTrace();
        }
    }

    public void updatemerek(String merek, String id){
        try{
            sql = "update stash SET merek =? WHERE id =?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, merek);
            stat.setString(2, id);
            stat.executeUpdate();
        } catch (SQLException e){
            System.out.println("GAGAL RUBAH DATA MERK");
            e.printStackTrace();
        }
    }

    public void updatesize(String size, String id){
        try{
            sql = "update stash SET size =? WHERE id =?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, size);
            stat.setString(2, id);
            int rows = stat.executeUpdate();
            System.out.println(rows + "row(s) updated!");
        } catch (SQLException e){
            System.out.println("GAGAL RUBAH DATA UKURAN SEPATU");
            e.printStackTrace();
        }
    }


    public void updatepcs(String pcs, int id){
        try{
            sql = "update stash SET pcs =? WHERE id =?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, pcs);
            stat.setString(2, id);
            int rows = stat.executeUpdate();
            System.out.println(rows + "row(s) updated!");
        } catch (SQLException e){
            System.out.println("GAGAL RUBAH DATA JUMLAH DATA!!!");
            e.printStackTrace();
        }
    }
}