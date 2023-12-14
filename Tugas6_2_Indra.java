public class Tugas6_2_Indra {
    public static void main (String [] args) {
        
        int anak2 = 50000;
        int dewasa = 100000;
        int total = 0;
        int counter = 0;
        int jumlah;

        for (int i = 1; i <= 31; i++) {
            if (i % 7 == 0) {
                continue; }

            else {
                total += i;
                counter++;
            }
        }

        jumlah = (5*anak2) + (5*dewasa);
        
        System.out.print("Jumlah uang pemasukan bulan Agustus adalah : " + counter * jumlah );
    }
}
