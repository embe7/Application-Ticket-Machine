import java.util.Scanner;

public class Main {

    public static String asal;
    public static String tujuan;
    public static String JenisTransportasi;

    //Pesawat
    public static int JumlahPenumpangPesawat;
    public static int HargaTiketPesawat;
    public static int TotalHargaTiketPesawat;
    public static int JumlahPembayaranTiketPesawat;


    //Kreta
    public static int JumlahPenumpangKreta;
    public static int HargaTiketKreta;
    public static int TotalHargaTiketKreta;

    //BUss
    public static int JumlahPenumpangBuss;
    public static int HargaTiketBuss;
    public static int TotalHargaTiketBuss;

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

    //ShowTransportasiKreta
    public static void showTransportasiKreta(){
        if (asal.equals("medan") & tujuan.equals("jakarta")){
            HargaTiketKreta = 2000000;
            System.out.println("Harga Tiket Rp." + HargaTiketKreta);
            TotalHargaTiketKreta = HargaTiketKreta * JumlahPenumpangKreta;
            System.out.println("Total Harga Rp." + TotalHargaTiketKreta);
        }else if(asal.equals("Jakarta") & tujuan.equals("medan")){
            HargaTiketKreta = 2000000;
            System.out.println("Harga Tiket Rp." + HargaTiketKreta);
            TotalHargaTiketKreta = HargaTiketKreta * JumlahPenumpangKreta;
            System.out.println("Total Harga Rp." + TotalHargaTiketKreta);
        }else if (asal.equals("medan") & tujuan.equals("aceh")){
            HargaTiketKreta = 1000000;
            System.out.println("Harga Tiket Rp." + HargaTiketKreta);
            TotalHargaTiketKreta = HargaTiketKreta * JumlahPenumpangKreta;
            System.out.println("Total Harga Rp." + TotalHargaTiketKreta);
        }else if(asal.equals("aceh") & tujuan.equals("medan")){
            HargaTiketKreta = 1000000;
            System.out.println("Harga Tiket Rp." + HargaTiketKreta);
            TotalHargaTiketKreta = HargaTiketKreta * JumlahPenumpangKreta;
            System.out.println("Total Harga Rp." + TotalHargaTiketKreta);
        }else {
            System.out.println("Lokasi Belum Tersedia");
        }
    }

    //showTransportasiBuss
    public static void showTransportasiBuss(){
        if (asal.equals("medan") & tujuan.equals("jakarta")){
            HargaTiketBuss = 500000;
            System.out.println("Harga Tiket Rp." + HargaTiketBuss);
            TotalHargaTiketBuss = HargaTiketBuss * JumlahPenumpangBuss;
            System.out.println("Total Harga Rp." + TotalHargaTiketBuss);
        }else if(asal.equals("Jakarta") & tujuan.equals("medan")){
            HargaTiketBuss = 500000;
            System.out.println("Harga Tiket Rp." + HargaTiketBuss);
            TotalHargaTiketBuss = HargaTiketBuss * JumlahPenumpangBuss;
            System.out.println("Total Harga Rp." + TotalHargaTiketBuss);
        }else if (asal.equals("medan") & tujuan.equals("aceh")){
            HargaTiketBuss = 200000;
            System.out.println("Harga Tiket Rp." + HargaTiketBuss);
            TotalHargaTiketBuss = HargaTiketBuss * JumlahPenumpangBuss;
            System.out.println("Total Harga Rp." + TotalHargaTiketBuss);
        }else if(asal.equals("aceh") & tujuan.equals("medan")){
            HargaTiketBuss = 200000;
            System.out.println("Harga Tiket Rp." + HargaTiketBuss);
            TotalHargaTiketBuss = HargaTiketBuss * JumlahPenumpangBuss;
            System.out.println("Total Harga Rp." + TotalHargaTiketBuss);
        }else {
            System.out.println("Lokasi Belum Tersedia");
        }
    }

    //showTransaksiPesawat
    static int showTransaksiPesawat(int total, int JumlahBayar){
        total = TotalHargaTiketPesawat;
        JumlahBayar = JumlahPembayaranTiketPesawat;
        int dataTransaksi = JumlahBayar -  total;
        System.out.print("Kembalian = Rp." + dataTransaksi);

        return dataTransaksi;
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

        viewShowTransaksiPesawat();

    }
    //view transportasi kreta
    public static void viewTransportasiKreta(){
        System.out.println("==== Transportasi Kreta ====");

        Scanner InputUser = new Scanner(System.in);
        System.out.print("asal           : ");
        asal = InputUser.next();
        System.out.print("tujuan         : ");
        tujuan = InputUser.next();
        System.out.print("jumlah pesanan : ");
        JumlahPenumpangKreta = InputUser.nextInt();

        showTransportasiKreta();

    }
    //view transportasi buss
    public static void viewTransportasiBuss(){
        System.out.println("==== Transportasi Buss ====");

        Scanner InputUser = new Scanner(System.in);
        System.out.print("asal :");
        asal = InputUser.next();
        System.out.print("tujuan : ");
        tujuan = InputUser.next();
        System.out.print("pumlah pesanan : ");
        JumlahPenumpangBuss = InputUser.nextInt();

        showTransportasiBuss();
    }

    //viewShowTransaksiPesawat
    public static void viewShowTransaksiPesawat(){
        Scanner InputJumlahBayar = new Scanner(System.in);

        System.out.println("==== Menu Transaksi Pesawat ====");
        System.out.println("Asal : " + asal);
        System.out.println("Tujuan : " + tujuan);
        System.out.println("Jumlah Penumpang : " + JumlahPenumpangPesawat);
        System.out.println("Total Harga = Rp." + TotalHargaTiketPesawat);
        System.out.print("Jumlah Pembayaran = Rp.");
        JumlahPembayaranTiketPesawat = InputJumlahBayar.nextInt();

        showTransaksiPesawat(TotalHargaTiketPesawat,JumlahPembayaranTiketPesawat);
    }
}
