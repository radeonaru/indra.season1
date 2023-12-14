import java.util.Scanner;
public class Tugas6_1_Indra {
    public static void main (String [] args) {
        Scanner scan = new Scanner (System.in);

        // NIM : 2241720217
        // Angka Terakhir NIM : 7
        // Input kelipatan : 7 + 2 = 9
        
        int angka;
        int kelipatan = 9;

        System.out.print("Masukkan batas angka : ");
        angka = scan.nextInt();

        for (int i = 1; i <= angka; i++) {
            if (i % kelipatan == 0) {
                continue;
            }
            System.out.print(i + " ");
        }

    }
}
