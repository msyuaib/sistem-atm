package tugasuts;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class bank {
    Scanner baca = new Scanner(System.in);
    double saldo = 0;
 
    void cekSaldo() {
        System.out.println("Saldo Anda Saat ini adalah sebesar :Rp." + saldo + "-.");
    }
 
    void ambilUang(double am) {
        System.out.println("Anda Akan Mengambil Sejumlah :Rp." + am + "-.");
        transaksi(am);
    }
 
    void tambahUang(double tb) {
        System.out.println("Anda Menambah Uang Sejumlah :Rp." + tb + "-.");
        this.saldo += tb;
    }
    void transfer(){
        System.out.print("Masukkan Rekening Tujuan : ");String no=baca.next();
        System.out.print("Masukkan Jumlah Kiriman  : ");int nominal=baca.nextInt();
        System.out.println("Anda Akan Mentransfer Sejumlah "+nominal+ " ke rekening "+no);
        System.out.print("Apakah benar data tsb? (y/n)");char l=baca.next().charAt(0);
        if(l=='y'){
            System.out.println("Transaksi sedang diproses");
            transaksi(nominal);
    }else{
            System.out.println("Transaksi Dibatalkan User");
        }
    }
 
    void menuLain() {
        System.out.println("Menu Tambahan : ");
        System.out.println("1.Pulsa");
        System.out.println("2.Listrik");
        System.out.println("3.Pembelian");
        System.out.print("Pilihan Anda:");
        int masuk = baca.nextInt();
        switch (masuk) {
            case 1 -> {
                System.out.print("Masukkan No Hp  : ");
                String no = baca.next();
                System.out.print("Masukkan Nominal: ");
                int nominal = baca.nextInt();
                String tipe;
                tipe = switch (no.substring(0, 3)) {
                case "081" -> "Telkomsel";
                case "083" -> "Axis";
                case "089" -> "Three";
                case "085" -> "indosat";
                case "087" -> "XL";
                case "082" -> "Sampoerna Telecom";
                case "088" -> "Mobile 8 / Smartfren";
                default -> "tidak terdeteksi";
            };
                System.out.println("Pengisian untuk no : " + no +"("+tipe+")"+ " Sejumlah " + nominal + " Telah Berhasil");
                transaksi(nominal);
            }
            case 2 -> {
                System.out.print("Masukkan No Pelanggan  : ");
                String no = baca.next();
                System.out.print("Masukkan Nominal: ");
                int nominal = baca.nextInt();
                System.out.println("Pengisian untuk no : " + no + " Sejumlah " + nominal + " Telah Berhasil");
                transaksi(nominal);
            }
            case 3 -> {
                System.out.print("Masukkan Kode Pembelian : ");
                String no = baca.next();
                if (no.length() > 9) {
                    String tr = no.substring(0, 8);
                    System.out.println("Pembelian untuk kode " + no + " Telah berhasil sejumlah Rp." + tr);
                    transaksi(Double.parseDouble(tr));
                } else {
                    System.out.println("Transaksi dengan kode " + no + " Tidak tersedia\n Transaksi Dibatalkan");
                }
            }
            default -> System.out.println("Fitur Tidak Tersedia");
        }
    }
 
    public double transaksi(double tr) {
        if (this.saldo < tr) {
            System.out.println("Transaksi Tidak Dapat dilanjutkan \nUang anda Tidak Mencukupi untuk Transaksi ini\nSisa Saldo anda sebesar Rp. " + this.saldo);
        } else {
            System.out.println("Transaksi Berhasil");
            return this.saldo -= tr;
        }
        return this.saldo;
    }
}

    