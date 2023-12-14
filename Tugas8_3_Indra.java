import java.util.Scanner;
public class Tugas8_3_Indra {
    public static void main(String [] args){
        Scanner input = new Scanner (System.in);

        System.out.print("Masukan banyaknya elemen : ");
        int [] nilai19 = new int [input.nextInt()];

        for (int i = 0; i < nilai19.length; i++) {
            System.out.print("Masukan nilai elemen ke - " + (i + 1) + " : ");
            nilai19 [i] = input.nextInt();
        }
        
        for (int j = 0; j < nilai19.length; j++) {
            if (nilai19 [j] % 2 == 0) {
                System.out.println("Angka genap : " + nilai19 [j]);
            }
            else if (nilai19 [j] % 2 == 1) {
                continue;
            }
        }

        for (int k = 0; k < nilai19.length; k++) {
            if (nilai19 [k] % 2 == 1) {
                System.out.println("Angka ganjil : " + nilai19 [k]);
            }
            else if (nilai19 [k] % 2 == 0) {
                continue;
            }
        }
    }
}
