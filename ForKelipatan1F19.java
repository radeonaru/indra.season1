import java.util.Scanner;
public class ForKelipatan1F19 {
    public static void main (String [] args) {

        Scanner scan = new Scanner (System.in);
        int kelipatan, jumlah, counter, total = 0;
        float rata2;
        jumlah = 0;
        counter = 0;

        System.out.print("Masukkan bilangan kelipatan (1-9) : ");
        kelipatan = scan.nextInt();

        for (int i = 1; i <= 50; i++) {
            if (i % kelipatan == 0) {
                total += i;
                counter++;

            }
        }

        rata2 = (float)total / (float)counter;
        System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
        System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n",  kelipatan, total);
        System.out.printf("Rata - rata dari %d adalah %.2f\n", total, rata2);
    }
}
