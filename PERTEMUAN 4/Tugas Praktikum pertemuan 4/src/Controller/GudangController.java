package Controller;
import Entity.GudangEntity;
import Model.GudangModel;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.util.ArrayList;

public class GudangController {

//    public GudangModel GudangModel = new GudangModel();
//    public void Syc(){
//        GudangModel.toSyc();
//    }
//    public void insert(String id, String merek, String size, String pcs){
//        GudangModel.insert(id, merek, size, pcs);
//    }
//
//    public void display(){
//        GudangModel.display();
//    }
//
//    public void update(String id, String merek, String size, String pcs){
//        GudangModel.update(id, merek, size, pcs);
//    }
//
//    public void delete(String id){
//        GudangModel.delete(id);
//    }
//
//    private void toSyc() {
//        throw new UnsupportedOperationException("Not supported yet.");  //throw digunakan untuk secara
//                                                                        //eksplisit melempar sebuah exception.
//    }
public TableModel stash;
    @Override
    public void insert(String id,String merek, String size, String pcs){
        GudangEntity gudangEntity = new GudangEntity() {};
        gudangEntity.setId(id);
        gudangEntity.setMerek(merek);
        gudangEntity.setSize(size);
        gudangEntity.setPcs(pcs);
        AllObjectModel.gudangModel.insert(gudangEntity);
    }

    public void update(int urut, String data, int id){
        switch(urut){
            case 1:
                AllObjectModel.gudangModel.updatemerek(data, id);
                break;
            case 2:
                AllObjectModel.gudangModel.updatesize(data, id);
                break;
            case 3:
                AllObjectModel.gudangModel.updatepcs(data, id);
                break;
        }
    }

    public ArrayList<GudangEntity> getDatasepatu(){
        return AllObjectModel.gudangModel.getstash();
    }

    public DefaultTableModel daftarsepatu(){
        DefaultTableModel dataDaftarsepatu = new DefaultTableModel();
        Object[] kolom = {"ID", "MERK", "UKURAN", "JUMLAH"};
        dataDaftarsepatu.setColumnIdentifiers(kolom);
        int size = getDatasepatu().size();
        for(int i = 0; i < size; i++ ){
            Object[] data = new Object[5];
            data[0] = AllObjectModel.gudangModel.getstash().get(i).getId();
            data[1] = AllObjectModel.gudangModel.getstash().get(i).getMerek();
            data[2] = AllObjectModel.gudangModel.getstash().get(i).getSize();
            data[3] = AllObjectModel.gudangModel.getstash().get(i).getPcs();
            dataDaftarsepatu.addRow(data);
        }
        return dataDaftarsepatu;
    }

    public void ubahmerk(int kode) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void deleteData(int kode) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void updateukuran(String inputukuran, int cek) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
