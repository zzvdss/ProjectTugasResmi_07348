package Entity;

public abstract class GudangEntityAbstract {
    private String merek;
    private String size;
    private String pcs;

    public GudangEntityAbstract(String merek, String size, String pcs){
        this.merek = merek;
        this.size = size;
        this.pcs = pcs;
    }

    public String getMerek(){
        return merek;
    }
    public void setMerek (String merek){
        this.merek = merek;
    }
    public String getSize(){
        return size;
    }
    public void setSize (String size){
        this.size = size;
    }
    public String getPcs(){
        return pcs;
    }
    public void setPcs (String pcs){
        this.pcs = pcs;
    }
}
