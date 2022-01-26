package Controller;

import Entity.DaftarEntity;
import Entity.PetugasEntity;
import Entity.SiswaEntity;
import java.util.ArrayList;
public class PetugasController {
    public void insert(String nama, String alamat, String noTelp, String password, String petugaskelas) {
        AllObjectModel.petugasModel.insert(new PetugasEntity(nama,alamat, noTelp, password, petugaskelas));
    }
    
    public void deleteData(int index){
        AllObjectModel.petugasModel.deleteData(index);
    }
    
    public void update(String pass, int id){
        AllObjectModel.petugasModel.update(pass, id);
    }
    
    public int CekLogin(String id, String password){
        int cek = AllObjectModel.petugasModel.cekLogin(id, password);
        return cek;
    }
    
    public void updateIsVerified(int index, boolean verify, SiswaEntity siswa){
        DaftarEntity daftar = new DaftarEntity(siswa, verify, index);  
    }
}
