package Controller;

import Entity.DaftarEntity;
import Entity.PetugasEntity;
import Entity.SiswaEntity;
import java.util.ArrayList;
public class PetugasController {
    public void insert(String nama, String alamat, String noTelp, String password, String petugaskelas) {
        AllObjectModel.PetugasModel.insert(new PetugasEntity(nama,alamat, noTelp, password, petugaskelas));
    }
    
    public void deleteData(int index){
        AllObjectModel.PetugasModel.deleteData(index);
    }
    
    public void updatepassword(String pass, int id){
        AllObjectModel.PetugasModel.update(pass, id);
    }
    
    public int login(String nama, String password){
        int cek = AllObjectModel.PetugasModel.login(nama, password);
        return cek;
    }
    
    public void verifsiswa(int id){
        AllObjectModel.PetugasModel.verifsiswa(id);
    }
}
