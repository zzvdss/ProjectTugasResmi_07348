package Entity;

public class UserEntity {
    protected int id;
    protected String nama, alamat, noTelp, password;
    public UserEntity(){
        
    }
    public UserEntity(String nama, String alamat, String noTelp, String password){
        this.nama = nama;
        this.alamat = alamat;
        this.noTelp = noTelp;
        this.password = password;
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
}
