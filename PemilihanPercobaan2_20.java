import java.util.Scanner;
public class PemilihanPercobaan2_20 {
    public static void main (String[]args) {
        Scanner input = new Scanner (System.in);

        int nilai1, nilai2, ratarata;
        System.out.println("Masukkan sebuah bilangan 1 : ");
        nilai1=input.nextInt();
        System.out.println("Masukkan sebuah bilangan 2 : ");
        nilai2=input.nextInt();
        ratarata=(nilai1+nilai2)/2;
        if (ratarata >= 100) {
            ratarata -= 5;
        }

        System.out.println("Hasil nilai akhir adalah " + ratarata);

    }
}
