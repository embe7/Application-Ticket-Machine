import java.util.Scanner;

public class Main {

    public static String asal;
    public static String tujuan;

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

    //viewShowAsalDanTujuan
    public static void viewShowAsalDanTujuan(){
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
}
