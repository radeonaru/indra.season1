import java.util.Scanner;
public class Tugas7_4_Indra {
   public static void main (String [] Args){
        int angka;
        Scanner scan = new Scanner (System.in);
        System.out.print("Masukkan nilai N : ");
        angka = scan.nextInt();
        
        if (angka >=5) {

        for (int line = 1; line <= angka; line++) {

        if (line % 2 == 1) {
        for (int i = 1; i <= angka; i++) {
            System.out.print(i);
        }
    }
        else {
            for (int i = angka; i >= 1; i--) {
                System.out.print(i);
        }
   }
   System.out.println(); 
        }
    }
}
}