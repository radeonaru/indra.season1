import java.util.Scanner;
public class WhileGaji1F19 {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);

        int karyawan, gaji, jam, jumlah;
        String jabatan;
        jumlah = 0;
        
        System.out.print("Masukkan jumlah karyawan : ");
        karyawan = scan.nextInt();

        int i = 0;
        while (i < karyawan) {
            System.out.println(" Pilihan jabatan - Direktur, Manager, Staf");
            System.out.print("Masukkan karyawan ke-" + (i + 1) + " : ");
            jabatan = scan.next();
            System.out.print("Masukkan jumlah jam lembur : ");
            jam = scan.nextInt();
            i++;
            if (jabatan.equalsIgnoreCase("direktur")) {
                continue;
            } else if (jabatan.equalsIgnoreCase("manager")) {
                gaji = jam * 100000;
            } else {
                gaji = jam * 75000;
            }
            jumlah += gaji;

            System.out.println("Pengeluaran perusahhan = " + jumlah);
        }  
    }
}
