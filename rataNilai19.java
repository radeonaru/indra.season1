import java.util.Scanner;
public class rataNilai19 {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);

        System.out.print("Masukkan jumlah mahasiswa : ");
        int[] nilai = new int [sc.nextInt()];
        double total = 0;
        double rata;

        for (int i = 0; i < nilai.length; i++){
            System.out.print("Masukkan nilai mahasiswa ke " + (i + 1) + ": ");
            nilai [i] = sc.nextInt();
        }
            for (int i = 0; i < nilai.length; i++) {
                total += nilai [i];
        }

        rata = total / nilai.length;
        System.out.println ("Rata-rata nilai kelas adalah "+ rata);
    }
}
