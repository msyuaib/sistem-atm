package tugasuts;

import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class menu {
    public static void main(String[] args) {
        Scanner baca = new Scanner(System.in);
        bank menu = new bank();
        System.out.println("Selamat Datang Di Bank Bank Tut");
        int pilih;
        do {
            System.out.println("----------------");
            System.out.println("-Daftar Layanan-");
            System.out.println("1.Cek Saldo");
            System.out.println("2.Transfer Saldo");
            System.out.println("3.Ambil Uang");
            System.out.println("4.Tambah Saldo");
            System.out.println("5.Menu Lainnya");
            System.out.println("6.Exit");
            System.out.print("Masukkan Pilihan : ");
            pilih = baca.nextInt();
            System.out.println("----------------");
            switch (pilih) {
                case 1 -> menu.cekSaldo();
                case 2 -> menu.transfer();
                case 3 -> {
                    System.out.print("Masukkan Uang yang Anda Ambil: Rp.");
                    double am = baca.nextDouble();
                    menu.ambilUang(am);
                }
                case 4 -> {
                    System.out.print("Masukkan Uang yang Anda Tambah: Rp.");
                    double tb = baca.nextDouble();
                    menu.tambahUang(tb);
                }
                case 5 -> menu.menuLain();
                case 6 -> System.out.println("Terimakasih Sudah Menggunakan Layanan Kami");
                default -> System.out.println("Layanan Tidak tersedia");
            }
        } while (pilih != 6);
    }
    
}
