import java.util.Scanner;

public class Kuis_Indra_1 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        float kecepatanKilometer20;
        float kecepatanMeter20;
        
        System.out.println("----- Program Konversi Kecepatan -----");
        System.out.print("Masukkan kecepatan kendaraan : ");
        float kecepatan20 = sc.nextFloat();
        kecepatanKilometer20 = kecepatan20;
        kecepatanMeter20 = 1000 * kecepatan20 / 3600;

        System.out.println("Kecepatan Kendaraan " + kecepatanKilometer20 + " km/jam" + " atau " + kecepatanMeter20 + " m/s");

    }
}