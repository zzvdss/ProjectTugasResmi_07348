package Entity;

public class SiswaEntity extends UserEntity{
    private String jeniskelamin, kelas;
    private int status;
    
    public SiswaEntity(){};

    public void setnama(String nama){
        this.nama = nama; }
    
    public void setalamat(String alamat){
        this.alamat = alamat; }
 
    public void setnoTelp(String noTelp){
        this.noTelp = noTelp;}
    
    public void setid(int id){
        this.id = id; } 

    public void setpassword(String password){
        this.password = password; }
  
    public void setjeniskelamin(String jeniskelamin){
        this.jeniskelamin = jeniskelamin; }
    
    public void setkelas(String kelas){
        this.kelas = kelas;}
    
    public void setstatus(int status){
        this.status = status;}  

     //getter
    public String getnama(){
        return nama;}
    
    public String getalamat(){
        return alamat;}
          
    public String getnoTelp(){
        return noTelp;}
        
    public String getpassword(){
        return password;}
        
    public int getid(){
        return id;}
      
    public String getjeniskelamin(){
        return jeniskelamin;}
    
    public String getkelas(){
        return kelas;}
    
    public int getstatus(){
        return status;} 
}
    