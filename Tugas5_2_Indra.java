import java.util.Scanner;
public class Tugas5_2_Indra {
    public static void main (String [] args) {
        String menu;
        String pilih;
        int sisi, alas, tinggi; 
        float jari2;

        Scanner scan = new Scanner (System.in);

        System.out.println("Masukkan menu perintah [1.Luas, 2.Volume] : ");
        menu = scan.nextLine();

        if (menu.equals("1")) {
            System.out.println("Masukkan kode bangun datar [a.Persegi b.Segitiga] : ");
            pilih = scan.nextLine();
            if (pilih.equalsIgnoreCase("a")) {
                System.out.println("Masukkan sisi bangunan : ");
                sisi = scan.nextInt();
                System.out.println("Luas Persegi : " + (sisi * sisi));
            }
            else if (pilih.equalsIgnoreCase("b")) {
                System.out.println("Masukkan alas bangunan : ");
                alas = scan.nextInt();
                System.out.println("Masukkan tinggi bangunan : ");
                tinggi = scan.nextInt();
                System.out.println("Luas Segitiga : " + (alas * tinggi / 2));
            }
            else {
                System.out.println("Kode bangun datar yang anda masukkan salah.");
            }
        }
        else if (menu.equals("2")) {
            System.out.println("Masukkan kode bangun ruang [a.Kubus b.Tabung] : ");
            pilih = scan.nextLine();
            if (pilih.equalsIgnoreCase("a")) {
                System.out.println("Masukkan sisi bangunan : ");
                sisi = scan.nextInt();
                System.out.println("Volume Kubus : " + (sisi * sisi * sisi));
            }
            else if (pilih.equalsIgnoreCase("b")) {
                System.out.println("Masukkan jari-jari bangunan : ");
                jari2 = scan.nextInt();
                System.out.println("Masukkan tinggi bangunan : ");
                tinggi = scan.nextInt();
                System.out.println("Volume Tabung : " + (3.14 * jari2 * jari2 * tinggi));
            }
        }
        else {
            System.out.println("Menu perintah yang anda masukkan salah.");
        }


    }
}
