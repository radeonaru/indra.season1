import java.util.Scanner;
public class UTS_Trial_Indra_1 {
    public static void main (String [] args) {

        Scanner scan = new Scanner(System.in);

        String namaBarang, start, resume;
        int hargaBarang, jumlahBarang, totalHarga;
        double diskon, totalBayar;

        int i = 1;
        int jumlahHarga = 0;
        diskon = 0.075;

        System.out.println("---------- Nota Pembayaran ----------");
        System.out.print("Tekan 'enter' untuk memulai ");
        start = scan.nextLine();

        while (start == "") {
            
            System.out.println(" ");
            System.out.printf("Masukkan nama barang ke-%d : ", i);
            namaBarang = scan.next();

            System.out.print("Masukkan harga barang : ");
            hargaBarang = scan.nextInt();

            System.out.print("Masukkan jumlah barang : ");
            jumlahBarang = scan.nextInt();

            totalHarga = hargaBarang * jumlahBarang;
            jumlahHarga += totalHarga;
           
            System.out.println("Total harga : " + totalHarga);
            System.out.println(" ");
            System.out.println("Total pembayaran saat ini : " + jumlahHarga);
            System.out.println("Tekan 'enter' untuk melanjutkan ");
            System.out.print("");
            resume = scan.nextLine();
            System.out.println("Masukkan huruf apapun untuk menyelesaikan nota");
            resume = scan.nextLine();

           
            if (resume.equalsIgnoreCase("")) {
                i++;
                }

            else {
                
                System.out.println(" ");
                System.out.println("---------------------------------");
                System.out.println("Total harga barang :" + jumlahHarga);
                System.out.println("Diskon : " +(jumlahHarga * diskon));
                totalBayar = jumlahHarga - (jumlahHarga * diskon);
                System.out.println("Total pembayaran : " + totalBayar );

                break;

             }
               
        }
    }
}
