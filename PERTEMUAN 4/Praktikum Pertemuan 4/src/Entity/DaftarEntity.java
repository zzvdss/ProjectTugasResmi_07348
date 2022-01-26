package Entity;

public class DaftarEntity {
    private SiswaEntity siswa ;
    private boolean verif;
    public DaftarEntity(SiswaEntity siswa, boolean verif){
        this.siswa = siswa;
        this.verif = verif;
    }
    
    public SiswaEntity getsiswa(){
        return siswa;
    }
    public void setSiswaEntity(SiswaEntity siswa){
        this.siswa = siswa;
    }
    
    public boolean getVerif(){
        return verif;
    }
    public void setVerif(boolean verif){
        this.verif = verif;
    }
}
