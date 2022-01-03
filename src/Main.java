import java.util.Scanner;

public class Main {

    public static String asal;
    public static String tujuan;
    public static String JenisTransportasi;

    //Pesawat
    public static int JumlahPenumpangPesawat;
    public static int HargaTiketPesawat;
    public static int TotalHargaTiketPesawat;

    public static void main(String[] args) {
        viewShowJenisTransportasi();
    }

    //ShowJenisTransportasi
    public static void showJenisTransportasi(){

        if (JenisTransportasi.equals("1")){
            viewTransportasiPesawat();
        }else if(JenisTransportasi.equals("2")){
            viewTransportasiKreta();
        }else if (JenisTransportasi.equals("3")){
            viewTransportasiBuss();
        }else {
            System.out.println("Jenis Transportasi tidak ditemukan");
        }

    }

    //showTransportasiPesawat
    public static void showTransportasiPesawat(){
        if (asal.equals("medan") & tujuan.equals("jakarta")){
            HargaTiketPesawat = 7000000;
            System.out.println("Harga Tiket Rp." + HargaTiketPesawat);
            TotalHargaTiketPesawat = HargaTiketPesawat * JumlahPenumpangPesawat;
            System.out.println("Total Harga Rp." + TotalHargaTiketPesawat);
        }else if(asal.equals("Jakarta") & tujuan.equals("medan")){
            HargaTiketPesawat = 7000000;
            System.out.println("Harga Tiket Rp." + HargaTiketPesawat);
            TotalHargaTiketPesawat = HargaTiketPesawat * JumlahPenumpangPesawat;
            System.out.println("Total Harga Rp." + TotalHargaTiketPesawat);
        }else if (asal.equals("medan") & tujuan.equals("aceh")){
            HargaTiketPesawat = 2000000;
            System.out.println("Harga Tiket Rp." + HargaTiketPesawat);
            TotalHargaTiketPesawat = HargaTiketPesawat * JumlahPenumpangPesawat;
            System.out.println("Total Harga Rp." + TotalHargaTiketPesawat);
        }else if(asal.equals("aceh") & tujuan.equals("medan")){
            HargaTiketPesawat = 2000000;
            System.out.println("Harga Tiket Rp." + HargaTiketPesawat);
            TotalHargaTiketPesawat = HargaTiketPesawat * JumlahPenumpangPesawat;
            System.out.println("Total Harga Rp." + TotalHargaTiketPesawat);
        }else {
            System.out.println("Lokasi Belum Tersedia");
        }

    }

    //viewShowJenisTransportasi
    public static void viewShowJenisTransportasi(){
        Scanner InputUser = new Scanner(System.in);

        System.out.println("======================================================");
        System.out.println("==   Selamat Datang di Application Ticket Machine   ==");
        System.out.println("======================================================");
        System.out.println("1. Pesawat");
        System.out.println("2. Kreta");
        System.out.println("3. Buss");

        System.out.print("Pilih Jenis Transportasi : ");
        JenisTransportasi = InputUser.next();

        showJenisTransportasi();
    }
    //view transportasi pesawat
    public static void viewTransportasiPesawat(){
        Scanner InputUser = new Scanner(System.in);
        System.out.println("==== Transportasi Pesawat ====");
        System.out.print("Asal   : ");
        asal = InputUser.next();
        System.out.print("Tujuan : ");
        tujuan = InputUser.next();
        System.out.print("Jumlah Pesanan : ");
        JumlahPenumpangPesawat = InputUser.nextInt();

        showTransportasiPesawat();

    }
    //view transportasi kreta
    public static void viewTransportasiKreta(){
        System.out.println("==== Transportasi Kreta ====");
    }
    //view transportasi buss
    public static void viewTransportasiBuss(){
        System.out.println("==== Transportasi Buss ====");
    }
}
