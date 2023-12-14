import java.util.Scanner;
public class Tugas4_4_Indra {
    public static void main(String[]args) {
        Scanner input = new Scanner (System.in);
        float diskon, totalbayar;
        int jumlahA, jumlahB, jumlahC, hargaA, hargaB, hargaC, total;

        System.out.print("Masukkan Harga barang A : ");
        hargaA = input.nextInt();
        System.out.print("Masukkan Jumlah barang A : ");
        jumlahA = input.nextInt();
        System.out.print("Masukkan Harga barang B : ");
        hargaB = input.nextInt();
        System.out.print("Masukkan Jumlah barang B : ");
        jumlahB = input.nextInt();
        System.out.print("Masukkan Harga barang C : ");
        hargaC = input.nextInt();
        System.out.print("Masukkan Jumlah barang C : ");
        jumlahC = input.nextInt();

        total = (hargaA * jumlahA) + (hargaB * jumlahB) + (hargaC * jumlahC);
        
        if (total > 1000000){
            diskon = total * 10/100;
        }
        else if (total > 500000){
            diskon = total * 5/100;
        }
        else if (total > 200000){
            diskon = total * 2/100;
        }
        else {
            diskon = 0;
            System.out.println("Maaf anda tidak mendapatkan diskon");
        }

        totalbayar = total - diskon;


        System.out.println("-------------------------------------------------");
        System.out.println("\t\t Struk Nota \t\t\t");
        System.out.println("-------------------------------------------------");
        System.out.println("Nama Barang | \tHarga | Jumlah |   Total");
        System.out.println("Barang A  \t" + hargaA + " \t" + jumlahA +"   \t" + (hargaA * jumlahA));
        System.out.println("Barang B  \t" + hargaB + " \t" + jumlahB +"   \t" + (hargaB * jumlahB));
        System.out.println("Barang C  \t" + hargaC + " \t" + jumlahC +"   \t" + (hargaC * jumlahC));
        System.out.println("\nTotal\t\t: \t\t" + total);
        System.out.println("Diskon\t\t: \t\t" + diskon);
        System.out.println("Total Bayar \t: \t\t" + totalbayar);
}
}
