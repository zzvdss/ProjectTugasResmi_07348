package Entity07348;

public class MuridEntity07348 extends PendaftarEntity07348 {
    private String umur07348;
    public MuridEntity07348 (String umur07348, String nama07348, String notelp07348, String alamat07348){
        super(nama07348, notelp07348, alamat07348);
        this.umur07348 = umur07348;
    }

    public String getUmur07348() {

        return umur07348;
    }

    public void setUmur07348(String umur07348) {
        this.umur07348 = umur07348;
    }
    public void setNama07348(String nama07348){

        this.nama07348 = nama07348;
    }

    public String getNotelp07348() {

        return notelp07348;
    }

    public void setNotelp07348(String notel07348) {

        this.notelp07348 = notelp07348;
    }

    public String getAlamat07348() {

        return alamat07348;
    }

    public void setAlamat07348(String alamat07348) {

        this.alamat07348 = alamat07348;
    }

}
