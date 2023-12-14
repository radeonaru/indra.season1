import java.util.Scanner;
public class TugaAkhir2_Indra {
    
    static double hitungGajiPokok (double e, double f) {
        double gajiPokok = (e*f);
        return gajiPokok;
    }

    static double hitungTunjangan (double a, double b) {
        double tunjangan = ((a*0.1)*b) + (a*0.15);
        return tunjangan;

    }
    static double tunjanganAnak (double a, double b) {
        double tunjanganAnak = (a*0.1)*b;
        return tunjanganAnak;
    }
    static double tunjanganKesehatan (double a) {
        double tunjanganKesehatan = a*0.15;
        return tunjanganKesehatan;
    }

    static double hitunglembur (double g, double h) {
        double lembur = (g*0.01)*h ;
        return lembur;
    }

    

}
