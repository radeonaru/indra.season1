import java.util.Scanner;
public class Tugas5_1_Indra {
    public static void main (String [] args){
        String kodeKeberangkatan, kelasKereta;
        int pg = 1250000, sg = 1375000, mg = 2500000, reg = 50000, biayaAdmin = 50000;

        Scanner scan = new Scanner (System.in);

        System.out.println("Masukkan kode keberangkatan [pg/sg/mg/reg] : ");
        kodeKeberangkatan = scan.nextLine();
        System.out.println("Kode keberangkatan : " + kodeKeberangkatan);

        if (kodeKeberangkatan.equalsIgnoreCase("pg")) {
            System.out.println("Kelas Kereta : Eksekutif");
            System.out.println("Biaya Tiket : " + pg);
            System.out.println("Biaya Total : " + (pg + biayaAdmin));
            
            } 
        else if (kodeKeberangkatan.equalsIgnoreCase("sg")) {
            System.out.println("Kelas Kereta : Bisnis");
            System.out.println("Biaya Tiket : " + sg);
            System.out.println("Biaya Total : " + (sg + biayaAdmin));

            } 
        else if (kodeKeberangkatan.equalsIgnoreCase("mg")) {
            System.out.println("Kelas Kereta : Luxury");
            System.out.println("Biaya Tiket : " + mg);
            System.out.println("Biaya Total : " + (mg + biayaAdmin));

            }
        else if (kodeKeberangkatan.equalsIgnoreCase("reg")) {
            System.out.println("Kelas Kereta : Regular");
            System.out.println("Biaya Tiket : " + reg);
            System.out.println("Biaya Total : " + (pg + 0));
        } 
        else {
            System.out.println("Kode yang anda masukkan salah");
            }
            
        
    }
}
