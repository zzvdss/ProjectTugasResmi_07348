package Controller;

import Entity.DaftarEntity;
import Entity.SiswaEntity;
import Model.SiswaModel;
import java.util.ArrayList;
public class SiswaController {
    public ArrayList<SiswaEntity> getDataSiswa(){
        return AllObjectModel.siswaModel.getDataSiswa();
    }
    
    public void insert(String nama, String alamat, String noTelp, String password, String jeniskelamin, String kelas){
        SiswaEntity siswaE = new SiswaEntity();
        siswaE.setNama(nama);
        siswaE.setAlamat(alamat);
        siswaE.setNoTelp(noTelp);
        siswaE.setPassword(password);
        siswaE.setJenisKelamin(jeniskelamin);
        siswaE.setKelas(kelas);
        AllObjectModel.siswaModel.insert(siswaE);
    }

    public void updateData(int urut, String data, int id){
        switch(urut){
            case 1:
                AllObjectModel.siswaModel.update(data, id);
                break;
        }
    }

    public void delete(int index){
        AllObjectModel.siswaModel.delete(index);
    }

    public int ceklogin(String id, String password){
        int cek = AllObjectModel.siswaModel.cekLogin(id, password);
        return cek;
    }

    public ArrayList<SiswaEntity> getDataSiswa(int id){
        return AllObjectModel.siswaModel.getDataSiswa(id);
    }

    public ArrayList<DaftarEntity> cekDaftarKursus(int id){
        return AllObjectModel.daftarModel.cekData(id);
    }

    public ArrayList<DaftarEntity> showDaftarKursus(int index){
        return AllObjectModel.daftarModel.showDaftarKursus(index);
    }
}
