package Controller;

import Entity.GudangEntity;
import Gui.AllObjectControler;
import Model.GudangModel;

public class StashControler extends ControllerInterface{
    @Override
    public void insertData(String id, String merek, String ukuran, String jumlah) {
        AllObjectModel.gudangModel.insert(new GudangEntity());
    }
}
