import  java.util.Scanner;
public class Tugas9_2_Indra{
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int jumlahBuku[][] =  {
            {8,9,5,2},
            {7,5,10,3},
            {4,6,6,5},
        };
        int pemasukanCabang[]= new int [] {0,0,0,0};
        int totalBuku=0, totalPendapatan=0;
        int dieng=0, soehat=0, sengkaling=0;
        int harga, hargaNovel=40000, hargaKomik=28000, hargaPelajaran=60000, hargaEnsiklo=75000, max=0;
        char loop, menu;

            for(int i = 0; i<jumlahBuku.length;i++){
                for(int j = 0; j<jumlahBuku[0].length;j++){
                    switch (j){
                        case 0:
                        harga = jumlahBuku[i][j] * hargaNovel;
                        pemasukanCabang[i] +=harga;
                        if(pemasukanCabang[i]>max){
                            max = pemasukanCabang[i];
                        }
                        break;
                        case 1 :
                        harga = jumlahBuku[i][j] * hargaKomik;
                        pemasukanCabang[i] +=harga;
                        if(pemasukanCabang[i]>max){
                            max = pemasukanCabang[i];
                        }
                        break;
                        case 2:
                        harga = jumlahBuku[i][j] * hargaPelajaran;
                        pemasukanCabang[i] += harga;
                        if(pemasukanCabang[i]>max){
                            max = pemasukanCabang[i];
                        }
                        break;
                        case 3:
                        harga = jumlahBuku[i][j] * hargaEnsiklo;
                        pemasukanCabang[i] += harga;
                        if(pemasukanCabang[i]>max){
                            max = pemasukanCabang[i];
                        }
                        break;
                        default:
                        pemasukanCabang[i]=jumlahBuku[4][j];
                        if (pemasukanCabang[i] > max){
                            max = pemasukanCabang[i];
                        }
                    }
                totalBuku += jumlahBuku[i][j];
                }

                totalPendapatan += pemasukanCabang[i];
            }

        do{
            System.out.println("-");
            System.out.print("Pilih menu : \n a.\tBanyak buku yang terjual di setiap cabang \n b.\tTotal pemasukan Togamas \n c.\tCabang dengan pemasukan tertinggi\t\nPilihan anda: ");
            menu = userInput.next().charAt(0);
            System.out.println("===========================================================================");
            
                if (menu == 'a' ||menu == 'A'){
                    dieng = 0;
                    soehat = 0;
                    sengkaling = 0;
                  
                    for (int i = 0; i<jumlahBuku.length; i++){
                        for (int y = 0; y<jumlahBuku[0].length; y++){
                            if (i==0){
                            dieng += jumlahBuku[0][y];}
                            if (i==1){
                            soehat += jumlahBuku[1][y];}
                            if(i==2){
                            sengkaling += jumlahBuku[2][y];}
                            
                        } if (i==0){
                            System.out.printf("Banyak buku terjual di cabang dieng adalah:\t\t%d\n",dieng);
                        } if (i==1){
                            System.out.printf("Banyak buku terjual di cabang Soehat adalah:\t\t%d\n",soehat);
                        } if (i==2){
                            System.out.printf("Banyak buku terjual di cabang Sengkaling adalah:\t%d\n",sengkaling);
                        }
                    }
                    System.out.printf("Total penjualan buku dari semua cabang adalah:\t\t"+ (totalBuku)+"\n");
                } else if (menu == 'b'||menu=='B'){

                    System.out.printf("Togamas menjual buku sebanyak %s dengan pemasukan sebesar Rp%s\n",totalBuku,totalPendapatan);
                } else if (menu =='c'||menu=='C'){
                    if(pemasukanCabang[0]==max){
                        System.out.println("Pemasukan tertinggi di cabang Dieng, yaitu sebesar Rp"+pemasukanCabang[0]);
                    }if(pemasukanCabang[1]==max){
                        System.out.println("Pemasukan tertinggi di cabang Soehat, yaitu sebesar Rp"+pemasukanCabang[1]);
                    }if (pemasukanCabang[2]==max){
                        System.out.println("Pemasukan tertinggi di cabang Sengkaling, yaitu sebesar Rp"+pemasukanCabang[2]);
                    }
                }

        System.out.print("Apakah anda ingin mengulang program? masukkan (Y/y) untuk mengulang: ");
         loop = userInput.next().charAt(0);
        }while(loop == 'y' || loop == 'Y');
    }
}