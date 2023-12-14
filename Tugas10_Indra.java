import java.util.Scanner;

public class Tugas10_Indra {
    static int hitungLuasPermukaan (int s) {
        int Lp = s*s*6;
        return Lp;
    }

    static int hitungVolume (int s) {
        int V = s*s*s;
        return V;
    }

    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan jumlah kubus yang akan dihitung : ");
        int kubus = input.nextInt();
        for (int i = 1; i <= kubus; i++){
            System.out.printf("Masukkan panjang sisi kubus ke %d (Cm) : ", i);
            int sisi = input.nextInt();
            input.nextLine();
            int luasPermukaan = hitungLuasPermukaan(sisi);
            System.out.printf("Luas Permukaan kubus ke %d adalah %d Cm", i, luasPermukaan);
            System.out.println();
            int volume = hitungVolume(sisi);
            System.out.printf("Volume kubus ke %d adalah %d Cm", i, volume);
            System.out.println();
        }
    }
}
