import java.util.Scanner;

public class Percobaan419 {
    static int Kali(int C, int D){
        int H;
        H =(C + 10) % (D +19);
        return H;
    }

    static int Kurang(int A, int B){
        int X;
        A = A + 7;
        B = B + 4;
        X = Kali(A,B);
        return X;
    }

    static int Tambah(int X, int Y){
        int I;
        int J = (Kurang(X, Y));
        int K = (Kali(X, Y));
        I = J + K;
        return I;
    }
    

    public static void main (String [] args){
        int nilai1, nilai2;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Nilai X: ");
        nilai1 = input.nextInt();
        System.out.println("Masukkan Nilai Y: ");
        nilai2 = input.nextInt();
        int hasilTambah = Tambah(nilai1, nilai2);
        int hasilKurang = Kurang(nilai1, nilai2);
        System.out.println("Hasil Tambah adalah " + hasilTambah);
        System.out.println("Hasil Kurang adalah " + hasilKurang);
    }
}
