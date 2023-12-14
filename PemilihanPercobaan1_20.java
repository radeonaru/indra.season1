import java.util.Scanner;
public class PemilihanPercobaan1_20 {
    public static void main(String [] args) {
        Scanner input = new Scanner (System.in);

        int bil;
        System.out.println("Masukkan sebuah bilangan : ");
        bil = input.nextInt();

       String output= (bil%2==0) ?"Bilangan Genap":"Bilangan Ganjil";
       System.out.println(output);
    }
}
