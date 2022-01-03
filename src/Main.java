import java.util.Scanner;

public class Main {

    public static String asal;
    public static String tujuan;
    public static String JenisTransportasi;

    public static void main(String[] args) {
        
    }
    //ShowAsalDanTujuan
    public static void showAsalDanTujuan(){
        System.out.println("==== Halaman Pesan Tiket ====");
    }
//    //test showAsalDanTujuan
//    public static void testShowAsalDanTuhuan(){
//        showAsalDanTujuan();
//    }

    //ShowJenisTransportasi
    public static void showJenisTransportasi(){
        System.out.println("==== Pilih Jenis Transportasi ====");
        System.out.println("1. Pesawat");
        System.out.println("2. Kreta");
        System.out.println("3. Buss");
    }

    //viewShowAsalDanTujuan
    public static void viewShowAsalDanTujuan(){
        showAsalDanTujuan();
        Scanner InputUser = new Scanner(System.in);
        System.out.print("Asal   : ");
        asal = InputUser.next();
        System.out.print("Tujuan : ");
        tujuan = InputUser.next();
    }
//    //testViewShowAsalDanTujuan
//    public static void testViewShowAsalDanTujuan(){
//        viewShowAsalDanTujuan();
//    }

    //viewShowJenisTransportasi
    public static void viewShowJenisTransportasi(){
        Scanner InputUser = new Scanner(System.in);

        showJenisTransportasi();
        System.out.print("Pilih Jenis Transportasi : ");
        JenisTransportasi = InputUser.next();
    }
}
