    package Model;

    import Entity.PetugasEntity;
    import Helper.KoneksiData;
    import java.sql.*;
    import java.util.ArrayList;
    public class PetugasModel{
        private String sql;
        public Connection conn = KoneksiData.getconection();
        private ArrayList<PetugasEntity> DataPetugas = new ArrayList<>();

        public void insert(PetugasEntity x){
            try {
                String sql = "INSERT INTO petugas (nama, alamat, noTelp, password, petugaskelas) VALUES (?, ?, ?, ?, ?);";
                PreparedStatement stat = conn.prepareStatement(sql);
                stat.setString(1, x.getNama());
                stat.setString(2, x.getAlamat());
                stat.setString(3, x.getNoTelp());
                stat.setString(4, x.getPassword());
                stat.setString(5, x.getPetugasKelas());
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
                System.out.println("GAGAL HAPUS DATA!!!");
                e.printStackTrace();
            }
        }

        public int cekLogin(String id, String password) {
            int cek = 0;
            try {
                sql = "SELECT * FROM petugas WHERE id =? and password=?";
                PreparedStatement stat = conn.prepareStatement(sql);
                stat.setString(1, id);
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
