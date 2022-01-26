package Entity07348;
import java.util.Scanner;
public class PendaftaranKursus07348 {
    private static Scanner masuk = new Scanner(System.in);
    private static MuridEntity07348[] muridEntity07348s = new MuridEntity07348[100];
    private static MuridMasuk07348[] muridMasuk07348 = new MuridMasuk07348[100];
    private static int pilvarian;
    private static int jumPeserta = 0;

    public static void main(String[] args) {
        System.out.println("Selamat Datang Di Program Kursus EXO");
        int pil07348;
        do {
            System.out.println("Jumlah Peserta: " + jumPeserta);
            System.out.println("1. Daftarkan Murid Kursus");
            System.out.println("2. Lihat Murid Kursus Yang SUdah Terdaftar");
            System.out.println("3. Delete Murid");
            System.out.println("4. Ubah Data murid");
            pil07348 = masuk.nextInt();
            masuk.nextLine();
            switch (pil07348) {
                case 1:
                    insertPeserta();
                    break;
                case 2:
                    viewPeserta();
                    break;
                case 3:
                    deletePeserta();
                    break;
                case 4:
                    updatePeserta();
                    break;
            }
        } while (pil07348 != 0);
    }
    static void insertPeserta() {
        System.out.println("Input Nama: ");
        String nama07348 = masuk.nextLine();
        System.out.println("Input Umur: ");
        String umur07348 = masuk.nextLine();
        System.out.println("Input Alamat: ");
        String alamat07348 = masuk.nextLine();
        System.out.println("Input No.Telp: ");
        String noTelp07348 = masuk.nextLine();

        muridEntity07348s[jumPeserta] = new MuridEntity07348(umur07348, nama07348, noTelp07348, alamat07348);
        insertVarian();
    }
    static void insertVarian() {
        System.out.println("Varian : ");
        for (int i = 0; i < PaketKursusEntity07348.varian07348.length; i++) {
            System.out.println(i + ". " + PaketKursusEntity07348.varian07348[i]);
        }
        System.out.println("Pilih Varian; ");
        pilvarian = masuk.nextInt();
        System.out.println("Input kode peserta : ");
        String kodePeserta = masuk.next();
        muridMasuk07348[jumPeserta] = new MuridMasuk07348(muridMasuk07348[jumPeserta], pilvarian, kodePeserta);
        jumPeserta = jumPeserta + 1;
    }
    static void viewPeserta() {
        if (jumPeserta == 0) {
            System.out.println("Belum ada peserta terdaftar");
        } else {
            for (int i = 0; i < jumPeserta; i++) {
                System.out.println("==========================================");
                System.out.println("Kode Peserta: " + "\t" + muridMasuk07348[i].getKodemurid07348() + "\nNama : " + "\t" + muridEntity07348s[i].getNama07348() + "\n Umur: " + "\t" + muridEntity07348s[i].getUmur07348() + "\n Alamat: " + "\t" + muridEntity07348s[i].getAlamat07348() + "\n No.Telp : " + "\t" + muridEntity07348s[i].getNotelp07348() + "\n Lomba: " + "\t" + PaketKursusEntity07348.varian07348[muridMasuk07348[i].getIndexVarian07348()]);
                System.out.println("==========================================");
            }
        }

    }

    static void deletePeserta(){
        System.out.println("Masukan Kode Murid Yang Akan DI Hapus: ");
        String search = masuk.next();
        masuk.nextLine();
        int cari = 0;
        do {
            if (cari == jumPeserta){
                System.err.println("Tidak Ada data");
                break;
            }else if (muridMasuk07348[cari].getKodemurid07348().equals(search)){
                if (cari == jumPeserta- 1){
                    jumPeserta = jumPeserta - 1;
                } else {
                    for (int i = cari; i < jumPeserta; i++ ){
                        muridMasuk07348[i] = muridMasuk07348[i + 1];
                        muridEntity07348s[i] = muridEntity07348s[i + 1];
                    }
                    jumPeserta = jumPeserta - 1;
                } break;
            } else {
                cari = cari + 1;
            }
        }while (true);
    }
    static void updatePeserta() {
        System.out.println("Masukan Kode Murid Yang Mau DI EDIT: ");
        String search = masuk.next();
        int cari = 0;
        do {
            if (cari == jumPeserta) {
                System.err.println("Tidak Ada Data");
            } else if (muridMasuk07348[cari].getKodemurid07348().equals(search)) {
                int pilEdit;
                do {
                    System.out.println("Pilih data yang ingin diubah: ");
                    System.out.println("1. Lihat Biodata ");
                    System.out.println("2. Nama");
                    System.out.println("3. Alamat");
                    System.out.println("4. No Telp");
                    System.out.println("5. Umur");
                    System.out.println("0. Exit");
                    pilEdit = masuk.nextInt();
                    if (pilEdit == 1) {
                        System.out.println("======================================");
                        System.out.println("Kode Murid:" + muridMasuk07348[cari].getKodemurid07348());
                        System.out.println("======================================");
                        System.out.println("Nama : " + muridEntity07348s[cari].getNama07348());
                        System.out.println("Umur : " + muridEntity07348s[cari].getUmur07348());
                        System.out.println("Alamat : " + muridEntity07348s[cari].getAlamat07348());
                        System.out.println("No Telp : " + muridEntity07348s[cari].getNotelp07348());
                        System.out.println("=======================================");
                    } else if (pilEdit == 2) {
                        System.out.println("Ubah Nama: ");
                        String editNama = masuk.next();
                        muridEntity07348s[cari].setNama07348(editNama);
                    } else if (pilEdit == 3) {
                        System.out.println("Ubah Alamat: ");
                        String editAlamat = masuk.next();
                        muridEntity07348s[cari].setAlamat07348(editAlamat);
                    } else if (pilEdit == 4) {
                        System.out.println("Ubah No Telp");
                        String editNoTelp = masuk.next();
                        muridEntity07348s[cari].setNotelp07348(editNoTelp);
                    } else if (pilEdit == 5) {
                        System.out.println("Ubah Umur: ");
                        String editUmur = masuk.next();
                        muridEntity07348s[cari].setUmur07348(editUmur);
                    }
                } while (pilEdit != 0);
                break;
            } else {
                cari = cari + 1;
            }
        } while (true);
    }

}
