package Entity;

public class DaftarEntity {
    private SiswaEntity siswa ;
    private boolean verif;
    private int indexpelajaran;
    public DaftarEntity(SiswaEntity siswa, boolean verif, int indexpelajaran){
        this.siswa = siswa;
        this.verif = verif;
        this.indexpelajaran = indexpelajaran;
    }
    
    public SiswaEntity getsiswa(){
        return siswa;
    }
    public void setSiswaEntity07335(SiswaEntity siswa){
        this.siswa = siswa;
    }
    
    public boolean getVerif(){
        return verif;
    }
    public void setVerif(boolean verif){
        this.verif = verif;
    }
    
    public int getIndexPelajaran(){
        return indexpelajaran;
    }
    public void setPelajaran(int indexpelajaran){
        this.indexpelajaran = indexpelajaran;
    }
}
