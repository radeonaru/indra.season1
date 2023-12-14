import java.util.Scanner;
public class ArrayDua21F19 {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan banyaknya baris : ");
        int totalBaris = scan.nextInt();
        System.out.print("Masukkan banyaknya kolom : ");
        int totalKolom = scan.nextInt();
        String [][] pengunjung = new String [totalBaris][totalKolom];

        for (int baris = 0; baris < pengunjung.length; baris++){
            for (int kolom = 0; kolom < pengunjung[0].length; kolom++){
                System.out.printf("Masukkan pengunjung ke [%s] [%s]: ", baris, kolom);
                pengunjung[baris][kolom] = scan.next();
                pengunjung[baris][kolom] = scan.nextLine();
            }
            System.out.println("-----------------");
        }

        // for (int baris = 0; baris < 4; baris ++){
        //     for(int kolom = 0; kolom <2; kolom++){
        //         System.out.printf("%s \t", pengunjung [baris] [kolom]);
        //     }
        //     System.out.println("");
        }
    }
// }
