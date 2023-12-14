import java.util.Scanner;
public class Penggajian_Indra {
    static double hitungGajiPokok (double a, double b) {
        double gajiPokok = 70000*a*b;
        return gajiPokok;
    }
    static double hitungTunjangan (int a, double b) {
        double tunjangan = (a*200000) + (b*0.05);
        return tunjangan;
    }
    static double tunjanganAnak (int a) {
        double tunjanganAnak = a*200000;
        return tunjanganAnak;
    }
    static double tunjanganKesehatan (double b) {
        double tunjanganKesehatan = b*0.05;
        return tunjanganKesehatan;
    }
    static double hitunglembur (double a, double b) {
        double lembur = (a*0.01)*b ;
        return lembur;
    }
    static void printNama (int n){
        String nama [] = {"Budi", "Adi", "Tina", "Lisa", "Heru", "Arifin"};
        System.out.println("Nama Pegawai \t\t: " + nama[n]);
    }
    static void printTtl (int n){
        String ttl [] = {"Blitar, 22 Oktober 1999","Surabaya, 14 Januari 1997","Banyuwangi, 3 Mei 2000","Nganjuk, 9 Maret 1999","Ngawi, 27 Mei 1992","Kediri, 20 Desember 1996"};
        System.out.println("Tempat, tanggal lahir \t: " + ttl[n]);
    }
    static void printStatus (int n) {
        String status [] = {"Menikah","Menikah","Belum Menikah","Belum Menikah","Menikah","Menikah"};
        System.out.println("Status \t\t\t: " + status[n]);
    }
    static void printJabatan (int n) {
        String jabatan [] = {"Manager", "Koki", "Koki", "Kasir", "Dishwasher", "Dishwasher"};
        System.out.println("Jabatan \t\t: " + jabatan[n]);
    }
    static void printData (int f) {
        printNama(f);
        printTtl(f);
        printJabatan(f);
        printStatus(f);        
    }
    static void printSlipGaji (double a, int b, int c, int d, int e) {
        System.out.println("Gaji Pokok \t\t: " + a);
        System.out.println("Jumlah Kehadiran\t : " + b);
        System.out.println("- Lembur :\n Jam Lembur \t\t: " + c);
        System.out.println(" Gaji Lembur \t\t: " + hitunglembur(a, c));
        System.out.println("- Tunjangan : ");
        System.out.println(" Tunjangan anak \t: " + tunjanganAnak(d));
        System.out.println(" Tunjangan kesehatan \t: " + tunjanganKesehatan(a));
        System.out.println(" Total Tunjangan \t: " + hitungTunjangan(d, a));
        System.out.println("- Gaji Pegawai \t\t: " + e);
    }

    public static void main (String[]args){

        Scanner scan = new Scanner(System.in);

        char menu, ulang, ulangA;
        String data[][] = {
        {"Budi","Manager"}, 
        {"Adi", "Koki"},
        {"Tina", "Koki"},
        {"Lisa", "Kasir"},
        {"Heru", "Dishwasher"},
        {"Arifin", "Dishwasher"}};
        int anak[] = {1, 1, 0, 0, 1, 2};
        int jamLembur[] = {0, 0, 0, 0, 0, 0};
        int presensi[] = {30, 30, 30, 30, 30, 30};
        int gajiPegawai[] = {0, 0, 0, 0, 0, 0};
        double gajiPajak [] = {0, 0, 0, 0, 0, 0};
        double pajakPegawai [] = {0, 0, 0, 0, 0, 0};
        double gaji = 0;
        double pajak = 0;
        int gajiTotal = 0;
 
        System.out.println("========== RUMAH MAKAN 'LITHIA' ==========");
        System.out.println("========== APLIKASI  PENGGAJIAN ==========");

        // Input Username & Password
        System.out.print("Masukkan Username : ");
        String username = scan.next();
        System.out.print("Masukkan Password : ");
        String password = scan.next();

        if (username.equals("admin")){
            if (password.equals("12345")){
                for (int i = 0; i < data.length; i++) {
                    if (data[i][1].equals("Manager")) {
                        gaji = 2.5;
                        pajak = 0.15;
                    }
                    else if (data[i][1].equals("Koki")) {
                        gaji = 1.5;
                        pajak = 0.1;
                    }
                    else if (data[i][1].equals("Kasir")) {
                        gaji = 1.0;
                        pajak = 0.1;
                    }
                    else if (data[i][1].equals("Dishwasher")) {
                        gaji = 1.0;
                        pajak = 0.1;
                    }
            double gajiPokok = hitungGajiPokok(gaji, presensi[i]);
                gajiPegawai[i] += gajiPokok;
        
            double tunjangan = hitungTunjangan(anak[i], gajiPokok);
                gajiPegawai [i] += tunjangan;
        
            double lembur = hitunglembur(gajiPokok, jamLembur[i]);
                gajiPegawai [i] += lembur;

                    pajakPegawai [i] = gajiPegawai [i] * pajak;
                    gajiPajak [i] = gajiPegawai [i] - pajakPegawai [i];
            }
                   
        // Menu
        do {
        System.out.println("================== MENU ==================");
        System.out.println("Masukkan opsi menu (A/B/C/D): ");
        System.out.println("A. Perbarui Presensi Pegawai \nB. Pencarian Pegawai\nC. Laporan\nD. Cetak Slip Gaji Tiap Pegawai");
        System.out.print("=> Pilihan Opsi : ");
        menu = scan.next().charAt(0);
        
        // Input Absensi Karyawan
        if (menu=='A' || menu== 'a') {
            System.out.println("============ PRESENSI PEGAWAI ============");
            do {
            System.out.print("Masukkan kode pegawai (1-6) : ");
            int kode = scan.nextInt()-1;
            System.out.println("Nama pegawai : " + data[kode][0]);
            System.out.print("Masukkan jumlah kehadiran : ");
            presensi[kode] = scan.nextInt();
            System.out.print("Masukkan jumlah jam lembur : ");
            jamLembur[kode] = scan.nextInt();
            gajiPegawai[kode] = 0;
            gajiPajak[kode] = 0;
            pajakPegawai[kode] = 0;

            if (data[kode][1].equals("Manager")) {
                gaji = 2.5;
                pajak = 0.85;
            }
            else if (data[kode][1].equals("Koki")) {
                gaji = 1.5;
                pajak = 0.9;
            }
            else if (data[kode][1].equals("Kasir")) {
                gaji = 1.0;
                pajak = 0.9;
            }
            else if (data[kode][1].equals("Dishwasher")) {
                gaji = 1.0;
                pajak = 0.9;
            }

            double gajiPokok = hitungGajiPokok(gaji, presensi[kode]);
                gajiPegawai[kode] += gajiPokok;
        
            double tunjangan = hitungTunjangan(anak[kode], gajiPokok);
                gajiPegawai [kode] += tunjangan;
        
            double lembur = hitunglembur(gajiPokok, jamLembur[kode]);
                gajiPegawai [kode] += lembur;

                pajakPegawai [kode] = gajiPegawai [kode] * pajak;
                    gajiPajak [kode] = gajiPegawai [kode] - pajakPegawai [kode];

            System.out.println("==========================================");
            System.out.print("Ingin memperbarui absensi pegawai lainnya (Y/T)?\nPilihan Opsi => ");
            ulangA = scan.next().charAt(0);
            } while (ulangA == 'Y' || ulangA == 'y');
        }
        

    // Pencarian Pegawai
        else if (menu=='B'||menu=='b') {
            do {
            System.out.println("=========== PENCARIAN PEGAWAI ============");
            System.out.print("Masukkan kode pegawai (1-6) : ");
            int kode = scan.nextInt()-1;
            System.out.println("Identitas pegawai : ");
            printData(kode);
            System.out.println("Jumlah Anak\t\t: " + anak[kode]);
            System.out.println("==========================================");
            System.out.print("Ingin mencari identitas pegawai lagi (Y/T)?\nPilihan Opsi => ");
            ulangA = scan.next().charAt(0);
        } while (ulangA == 'Y' || ulangA == 'y');      
    }

    // Laporan Pegawai
        else if (menu=='C'||menu=='c') {
            System.out.println("============= LAPORAN PEGAWAI ============");
            for (int i=0; i<data.length; i++) {
                System.out.println();
                System.out.println("Kode Pegawai\t\t: " + (i + 1));
                printNama(i);
                printJabatan(i);
                System.out.println("Gaji Pegawai\t\t: " + gajiPegawai[i]);
                gajiTotal += gajiPegawai[i];
            }
            System.out.println("\nTotal Penggajian\t: " + gajiTotal);

    // Pencetakan Slip Gaji
        }
        else if (menu=='D'||menu=='d') {
            do {
            System.out.println("==========================================");
            System.out.println("Masukkan kode pegawai yang ingin dicetak (1-6): \n1."+ data[0][0] + "\n2." + data[1][0] + "\n3." + data[2][0] +"\n4." + data[3][0] + "\n5." + data[4][0] + "\n6." + data[5][0]);
            System.out.println("==========================================");
            System.out.print("=> Pilihan opsi : ");
            int kode = scan.nextInt()-1;
            System.out.println("============== SLIP GAJI =================");

                if (data[kode][1].equals("Manager")) {
                    gaji = 2.5;
                }
                else if (data[kode][1].equals("Koki")) {
                    gaji = 1.5;
                }
                else if (data[kode][1].equals("Kasir")) {
                    gaji = 1.0;
                }
                else if (data[kode][1].equals("Dishwasher")) {
                    gaji = 1.0;
                }
            
            double gajiPokok = hitungGajiPokok(gaji, presensi[kode]);
            switch (kode) { 
            case (0) :
            printNama(kode);
            printSlipGaji(gajiPokok, presensi[kode], jamLembur[kode], anak[kode], gajiPegawai[kode]);
            System.out.println("- Pajak pegawai \t: " + pajakPegawai[kode]);
            System.out.println("- Gaji Total \t\t: " + gajiPajak[kode]);
            break;

            case (1) :
            printNama(kode);
            printSlipGaji(gajiPokok, presensi[kode], jamLembur[kode], anak[kode], gajiPegawai[kode]);
            System.out.println("- Pajak pegawai \t: " + pajakPegawai[kode]);
            System.out.println("- Gaji Total \t\t: " + gajiPajak[kode]);
            break;

            case (2) :
            printNama(kode);
            printSlipGaji(gajiPokok, presensi[kode], jamLembur[kode], anak[kode], gajiPegawai[kode]);
            System.out.println("- Pajak pegawai \t: " + pajakPegawai[kode]);
            System.out.println("- Gaji Total \t\t: " + gajiPajak[kode]);
            break;

            case (3) :
            printNama(kode);
            printSlipGaji(gajiPokok, presensi[kode], jamLembur[kode], anak[kode], gajiPegawai[kode]);
            System.out.println("- Pajak pegawai \t: " + pajakPegawai[kode]);
            System.out.println("- Gaji Total \t\t: " + gajiPajak[kode]);
            break;

            case (4) :
            printNama(kode);
            printSlipGaji(gajiPokok, presensi[kode], jamLembur[kode], anak[kode], gajiPegawai[kode]);
            System.out.println("- Pajak pegawai \t: " + pajakPegawai[kode]);
            System.out.println("- Gaji Total \t\t: " + gajiPajak[kode]);
            break;
            
            case (5) :
            printNama(kode);
            printSlipGaji(gajiPokok, presensi[kode], jamLembur[kode], anak[kode], gajiPegawai[kode]);
            System.out.println("- Pajak pegawai \t: " + pajakPegawai[kode]);
            System.out.println("- Gaji Total \t\t: " + gajiPajak[kode]);
            break;

            default :
            System.out.println("Kode yang anda masukkan tidak valid.");
            }

            System.out.println("==========================================");
            System.out.println("Ingin mencetak slip gaji lagi? (Y/T)");
            System.out.print("Pilihan Opsi => ");
            ulangA = scan.next().charAt(0);
        } while (ulangA == 'Y' || ulangA == 'y');
    }
    else {System.out.println("Opsi yang anda masukkan tidak valid.");}
       
        System.out.println("==========================================");
        System.out.println("Tekan 'Y' untuk kembali ke menu\nTekan 'T' untuk mengakhiri program ");
        System.out.print("Pilihan Opsi => ");
        ulang = scan.next().charAt(0);

    } while (ulang == 'Y' || ulang =='y');
        System.out.println("==========================================");
        System.out.println("Program Berakhir.");

          } else {System.out.println("! Password salah.");}
        } else {System.out.println("! Username salah.");}
    }
}