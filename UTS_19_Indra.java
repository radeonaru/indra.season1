import java.util.Scanner;
public class UTS_19_Indra {
    public static void main (String [] args) {

        Scanner scan = new Scanner(System.in);

        String pelanggan19, resume19;
        int biaya19 = 50000, jumlahM, jumlahL, totalM, totalL, pakaian;
        int totalPakaian19 = 0;
        int totalPakaianM19 = 0;
        int totalPakaianL19 = 0;
        float totalPembayaran19;
        int i = 1;
        float diskon19 = 0.002f;
        float totalPendapatan19 = 0;

        do {
        System.out.printf("Masukkan nama pelanggan ke-%d : ", i);
        pelanggan19 = scan.next();

        System.out.print("Masukkan jumlah pakaian ukuran M : ");
        jumlahM = scan.nextInt();
        totalM = jumlahM*biaya19;
        System.out.print("Masukkan jumlah pakaian ukuran L : ");
        jumlahL = scan.nextInt();

        totalL = jumlahL*(biaya19+5000);
        totalPembayaran19 = totalL + totalM;
        pakaian = jumlahL + jumlahM;
        totalPakaianL19 += jumlahL;
        totalPakaianM19 += jumlahM;
        totalPakaian19 += pakaian;
        

        if (pelanggan19.equalsIgnoreCase("ahmad")){
          if (pakaian > 3){
            totalPembayaran19 = totalPembayaran19 - (totalPembayaran19 * diskon19);
          }
        }
            System.out.println("Total yang harus dibayar " + pelanggan19 + " adalah : " + totalPembayaran19);
            totalPendapatan19 += totalPembayaran19;
            System.out.println("");
            System.out.println("Tekan 'enter' untuk menambahkan pelanggan baru ");
            System.out.print("");
            resume19 = scan.nextLine();
            System.out.println("Masukkan huruf apapun untuk merekap pendapatan");
            resume19 = scan.nextLine();

           
            if (resume19.equalsIgnoreCase("")) {
                i++;
                }

            else {
                System.out.println("");
                System.out.println("-----------------------------------------------");
                System.out.println("Total pakaian yang dijahit hari ini adalah : "+ totalPakaian19);
                System.out.println("Total pakaian ukuran L : " + totalPakaianL19);
                System.out.println("Total pakaian ukuran M : " + totalPakaianM19);
                System.out.println("Total pendapatan anda adalah : " + totalPendapatan19);
                break;
        } 
            
    }while (i > 1);
    }
}