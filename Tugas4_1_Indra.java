import java.util.Scanner;
public class Tugas4_1_Indra {
    public static void main (String [] args) {
    Scanner input = new Scanner (System.in);
    int A;
    int B;

    System.out.println("Masukkan nilai A : ");
    A=input.nextInt();
    System.out.println("Masukkan nilai B : ");
    B=input.nextInt();

    if (A>B) {
        System.out.println("Nilai : " + A);
    }

    else {
        System.out.println("Nilai : " + B);
    }
    }
}
