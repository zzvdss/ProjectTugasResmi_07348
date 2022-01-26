package PendaftaranKursus;

import Controller.SiswaController;
import Controller.PetugasController;
import Entity.SiswaEntity;
import java.util.Scanner;
public class Pendaftarankursus {
    private static Scanner input = new Scanner(System.in);
    private static SiswaController siswa = new SiswaController();
    private static PetugasController petugas = new PetugasController();
    
    public static void main(String[] args) {
        int pil;
        do{
            System.out.println("Pendaftaran Kursus");
            System.out.println("1. Login Petugas");
            System.out.println("2. Login Siswa");
            System.out.println("0. Keluar ");
            System.out.println("Pilihan : ");
            pil = input.nextInt();
            input.nextLine();
            switch (pil){
                case 1: menupetugas();
                break;
                case 2: menusiswa();
                    break;
            }
        }while(pil != 0);
    }
    
    static void menupetugas(){
        int pil;
        do{
            System.out.println(" LOGIN PETUGAS  ");
            System.out.println("1. Regis Petugas");
            System.out.println("2. Login Petugas");
            System.out.println("0. Keluar ");
            System.out.print("Pilihan : ");
            pil = input.nextInt();
            input.nextLine();
            switch (pil){
                case 1: insertPetugas();break;
                case 2: loginPetugas();break;
            }
        }while(pil != 0);
    }
    
    static void insertPetugas(){
        System.out.print("Nama          : ");
        String nama = input.next();
        System.out.print("Alamat        : ");
        String alamat = input.next();
        System.out.print("No. Telp      : ");
        String noTelp = input.next();
        System.out.print("Password      : ");
        String password = input.next();
        System.out.print("Petugas Kelas : ");
        String petugaskelas = input.next();
        petugas.insert(nama, alamat, noTelp, password, petugaskelas);
    }
    
    public static void loginPetugas(){
        System.out.print("ID : ");
        String id = input.next();
        System.out.print("Password : ");
        String password = input.next();
        int cek = petugas.CekLogin(id, password);
        if(cek != 0){
            System.out.println("Berhasil Login");
        }
    }
    
    static void deleteData(){
        viewSiswa();
        System.out.print("Masukkan ID Yang Akan Di Hapus: ");
        int id = input.nextInt();
        petugas.deleteData(id);
    }
    
    static void menusiswa(){
        int pil;
        do{
            System.out.println("Pendaftaran Kursus");
            System.out.println("1. Regis Siswa");
            System.out.println("2. Login Siswa");
            System.out.println("3. View Siswa");
            System.out.println("0. Keluar ");
            System.out.print("Pilihan : ");
            pil = input.nextInt();
            input.nextLine();
            switch (pil){
                case 1: insertSiswa();break;
                case 2: loginsiswa();break;
                case 3: viewSiswa();break;
            }
        }while(pil != 0);
    }
    
    static void insertSiswa(){
        System.out.print("Nama          : ");
        String nama = input.next();
        System.out.print("Alamat        : ");
        String alamat = input.next();
        System.out.print("No. Telp      : ");
        String noTelp = input.next();
        System.out.print("Password      : ");
        String password = input.next();
        System.out.print("Jenis Kelamin : ");
        String jeniskelamin = input.next();
        System.out.print("Kelas         : ");
        String kelas = input.next();
        siswa.insert(nama, alamat, noTelp, password, jeniskelamin, kelas);
    }
    
    public static void loginsiswa(){
        System.out.println("ID : ");
        String id = input.next();
        System.out.println("Password : ");
        String password = input.next();
        int cek = siswa.ceklogin(id, password);
        if(cek != 0){
            System.out.println("Berhasil Login");
        }
    }
    
    static void viewSiswa(){
        for(SiswaEntity siswa : siswa.getDataSiswa()){
            System.out.println("------------------------------");
            System.out.println("Id            : " + siswa.getId());
            System.out.println("Nama          : " + siswa.getNama());
            System.out.println("Alamat        : " + siswa.getAlamat());
            System.out.println("No. Telp      : " + siswa.getNoTelp());
            System.out.println("Password      : " + siswa.getPassword());
            System.out.println("Jenis Kelamin : " + siswa.getJenisKelamin());
            System.out.println("Kelas         : " + siswa.getKelas());
        } 
    }
}
