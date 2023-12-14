import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
public class Tugas4_3_Indra {
    public static void main (String[]args){
        Scanner input= new Scanner (System.in);

    float nilaiuas, nilaiuts, nilaikuis, nilaitugas, nilaiakhir;
    System.out.println("Masukkan Nilai UAS anda : ");
    nilaiuas=input.nextFloat();

    System.out.println("Masukkan Nilai UTS anda : ");
    nilaiuts=input.nextFloat();

    System.out.println("Masukkan Nilai Kuis anda : ");
    nilaikuis=input.nextFloat();

    System.out.println("Masukkan Nilai Tugas anda : ");
    nilaitugas=input.nextFloat();


    
    nilaiuas *= 0.4;
    nilaiuts *= 0.3;
    nilaikuis *= 0.1;
    nilaitugas *= 0.2;
    nilaiakhir= nilaiuas + nilaiuts + nilaikuis + nilaitugas;

    System.out.println("Nilai Akhir anda adalah : " + nilaiakhir);


    if (nilaiakhir >= 65) {
        System.out.println("Selamat, anda tidak remidi pada semester ini");
    }

    else {
        System.out.println("Anda harus remidi pada semester ini");
    }
    
    }
}
