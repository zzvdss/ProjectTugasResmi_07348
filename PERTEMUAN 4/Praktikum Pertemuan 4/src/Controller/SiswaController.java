package Controller;

import Entity.DaftarEntity;
import Entity.SiswaEntity;
import Model.SiswaModel;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
public class SiswaController {
    public ArrayList<SiswaEntity> getSiswa(){
    return AllObjectModel.SiswaModel.getsiswa();
    }
    
    public void insertData(String nama, String password, String noTelp, String alamat, String jeniskelamin, String kelas){
        SiswaEntity siswa = new SiswaEntity();
        siswa.setnama(nama);
        siswa.setpassword(password);
        siswa.setnoTelp(noTelp);
        siswa.setalamat(alamat);
        siswa.setjeniskelamin(jeniskelamin);
        siswa.setkelas(kelas);
        AllObjectModel.SiswaModel.insertData(siswa);
    }
    
    public void update(int urut, String data, int id){
        switch(urut){
            case 1:
                AllObjectModel.SiswaModel.updatenama(data, id);
                break;
            case 2:
                AllObjectModel.SiswaModel.updatepassword(data, id);
                break;
            case 3:
                AllObjectModel.SiswaModel.updatenoTelp(data, id);
                break;
            case 4:
                AllObjectModel.SiswaModel.updatealamat(data, id);
                break;
            case 5:
                AllObjectModel.SiswaModel.updatejeniskelamin(data, id);
                break;
            case 6:
                AllObjectModel.SiswaModel.updatekelas(data, id);
                break;
        }
    }

    public int login(String nama, String password){
        int cek = AllObjectModel.SiswaModel.ceklogin(nama, password);
        return cek;
    }
    
    public int verif(int id){
        int cek = AllObjectModel.SiswaModel.verif(id);
        return cek;
    }

    public ArrayList<SiswaEntity> getSiswa(int id){
        return AllObjectModel.SiswaModel.getSiswa(id);
    }
    
       public DefaultTableModel dataSiswa(){
        DefaultTableModel dataSiswa = new DefaultTableModel();
        Object[] kolom = {"ID", "NAMA", "PASSWORD", "NO TELP", "ALAMAT", "JENIS KELAMIN", "KELAS", "STATUS"};
        dataSiswa.setColumnIdentifiers(kolom);
        int size = getSiswa().size();
        for(int i = 0; i < size; i++ ){
            Object[] data = new Object[8];
            data[0] = AllObjectModel.SiswaModel.getsiswa().get(i).getid();
            data[1] = AllObjectModel.SiswaModel.getsiswa().get(i).getnama();
            data[2] = AllObjectModel.SiswaModel.getsiswa().get(i).getpassword();
            data[3] = AllObjectModel.SiswaModel.getsiswa().get(i).getnoTelp();
            data[4] = AllObjectModel.SiswaModel.getsiswa().get(i).getalamat();
            data[5] = AllObjectModel.SiswaModel.getsiswa().get(i).getjeniskelamin();
            data[6] = AllObjectModel.SiswaModel.getsiswa().get(i).getkelas();
            data[7] = AllObjectModel.SiswaModel.getsiswa().get(i).getstatus();
            dataSiswa.addRow(data);
        }
        return dataSiswa;
    }
     public ArrayList<SiswaEntity> getByid(int ceklogin){
        return AllObjectModel.SiswaModel.getSiswa(ceklogin);
     }
}
