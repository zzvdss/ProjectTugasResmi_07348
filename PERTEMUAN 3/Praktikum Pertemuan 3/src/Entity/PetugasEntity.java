package Entity;

public class PetugasEntity extends UserEntity{
    private String petugaskelas;
    public PetugasEntity(String nama, String alamat, String noTelp, String password, String petugaskelas){
        super(nama,alamat,noTelp,password);
        this.petugaskelas = petugaskelas;
    }
    
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
    
    public String getPetugasKelas(){
        return petugaskelas;
    }
    public void setPetugasKelas(String petugaskelas){
        this.petugaskelas = petugaskelas;
    }
}
