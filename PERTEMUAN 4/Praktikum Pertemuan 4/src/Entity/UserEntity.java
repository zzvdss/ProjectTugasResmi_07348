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
    
    public String getnama(){
        return nama;
    }
    public void setnama(String nama){
        this.nama = nama;
    }
    
    public String getalamat(){
        return alamat;
    }
    public void setalamat(String alamat){
        this.alamat = alamat;
    }
    
    public String getnoTelp(){
        return noTelp;
    }
    public void setnoTelp(String noTelp){
        this.noTelp = noTelp;
    }
    
    public int getid(){
        return id;
    }
    public void setid(int id){
        this.id = id;
    }
    
    public String getpassword(){
        return password;
    }
    public void setpassword(String password){
        this.password = password;
    }
}
