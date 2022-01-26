package Entity;

public class SiswaEntity extends UserEntity{
    private String jeniskelamin;
    private String kelas;
    public SiswaEntity(){};
    
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getAlamat(){
        return alamat;
    }
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    
    public String getNoTelp(){
        return noTelp;
    }
    public void setNoTelp(String noTelp){
        this.noTelp = noTelp;
    }
    
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }
    
    public String getJenisKelamin(){
        return jeniskelamin;
    }
    public void setJenisKelamin(String jeniskelamin){
        this.jeniskelamin = jeniskelamin;
    }
    
    public String getKelas(){
        return kelas;
    }
    public void setKelas(String kelas){
        this.kelas = kelas;
    }
}
