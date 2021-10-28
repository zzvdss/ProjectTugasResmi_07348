package Kalkulator_07348;
import java.util.Scanner;

public class Kalkulator_07348 {
    public static void main(String args[]) {
     {
         String lagi = "Y";
         while(lagi.equals("Y")){
        Scanner input = new Scanner(System.in);
        int bil1_07348, bil2_07348, pil_07348, hasil_07348 = 0;
        System.out.println("PROGRAM JAVA KALKULATOR SEDERHANA");
        System.out.println("1. Perkalian");
        System.out.println("2. Pembagian");
        System.out.println("3. Penjumlahan");
        System.out.println("4. Pengurangan");
        System.out.println("----------------------------");
        System.out.print("Bilangan 1 : ");
        bil1_07348 = input.nextInt();
        System.out.println();
        System.out.print("Bilangan 2 : ");
        bil2_07348 = input.nextInt();
        System.out.print("Pilihan Operasi: ");
        pil_07348 = input.nextInt();

        switch (pil_07348) {
            case 1:
                hasil_07348 = bil1_07348 * bil2_07348;
                break;
            case 2:
                hasil_07348 = bil1_07348 / bil2_07348;
                break;
            case 3:
                hasil_07348 = bil1_07348 + bil2_07348;
                break;
            case 4:
                hasil_07348 = bil1_07348 - bil2_07348;
                break;
            default:
                System.out.println("Anda salah memasukan pilihan, pastikan anda mengetikkan angka dengan benar");

        }
             System.out.println("hasil: " + hasil_07348);
             System.out.print("Mau lagi (Y/T) ?");
             Scanner x = new Scanner(System.in);
             lagi = x.nextLine().toUpperCase();
        }
         System.out.println("Bye...");

    }
}

}
