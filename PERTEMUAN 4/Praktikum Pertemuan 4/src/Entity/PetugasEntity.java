package Entity;

public class PetugasEntity extends UserEntity{
    private String petugaskelas;
    public PetugasEntity(String nama, String alamat, String noTelp, String password, String petugaskelas){
        super(nama,alamat,noTelp,password);
        this.petugaskelas = petugaskelas;}
    
    //setter
    public void setid(int id){
        this.id = id;}
       
    public void setnama(String nama){
        this.nama = nama;}
     
    public void setpassword(String password){
        this.password = password;}
    
    public void setalamat(String alamat){
        this.alamat = alamat;}
    
    public void setnoTelp(String noTelp){
        this.noTelp = noTelp;}
       
    public void setpetugaskelas(String petugaskelas){
        this.petugaskelas = petugaskelas;}
     
    //getter
    public String getnama(){
        return nama;}
    
    public String getalamat(){
        return alamat;}
   
    public String getnoTelp(){
        return noTelp;}
 
    public int getid(){
        return id;}
    
    public String getpassword(){
        return password;}
    
    public String getpetugaskelas(){
        return petugaskelas;}
}
