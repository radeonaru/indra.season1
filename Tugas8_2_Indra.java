import java.util.Scanner;
public class Tugas8_2_Indra {
    public static void main(String [] args){
        Scanner input = new Scanner (System.in);

        System.out.print("Masukan banyaknya elemen  : ");
        int [] value19 = new int [input.nextInt ()];

        for (int i = 0; i < value19.length; i++) {
            System.out.print("Masukkan nilai elemen ke " + (i + 1) + " : ");
            value19 [i] = input.nextInt ();
        }

        int nilaiTerbesar19;
        int j = 0; 

        for (int k = 1; k < value19.length; k++) {
            if (value19 [j] < value19 [k]) {
                j = k;
            }
        }

        nilaiTerbesar19 = value19 [j];
        System.out.print("Nilai terbesar elemen adalah : " + nilaiTerbesar19);
    }
}
