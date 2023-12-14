import java.util.Scanner;
public class Kuis_19_Indra {
    public static void main (String[] args){
        Scanner scan = new Scanner (System.in);
        String nama [] ={"Italian Food", "Korean Food","Chinese Food","Khas Jogja","Khas Madura"};
        int makanan[][] = {{6,8,4},{10,16,11},{9,14,10},{12,5,7},{5,8,5}};
        int menu [] = {50000,50000,50000,35000,35000};
        int taxDelivery = 10000, taxTakeout = 5000;
        int total = 0;
        int jumlahMakanan [] = {0,0,0,0,0};
        int jumlahHarga [] = {0,0,0,0,0};
        int harga [] = {0,0,0,0,0};
        int min [] = {100, 100, 100, 100};
        int max [] = {0, 0, 0, 0};

        for(int i = 0; i < makanan.length; i++){
            System.out.println("Penjualan makanan " + nama[i]);
            for (int j = 0; j < makanan[0].length; j++){
                switch (j) {
                    case 0:
                    harga [i] = makanan[i][j] * menu [j];
                    jumlahMakanan [i] += makanan [i][j];
                    jumlahHarga [i] += harga [i];
                    System.out.println("Dine in : " + makanan [i][j]);
                    break;
                    case 1:
                    harga [i] = (makanan [i][j] + taxDelivery) * menu [i];
                    jumlahMakanan [i] += makanan [i][j];
                    jumlahHarga [i] += harga [i];
                    if (min[j] > makanan [i][j]){
                        min[j] = makanan [i][j];
                    }
                    if (max [j] < makanan [i][j]){
                        max [j] = makanan [i][j];
                    }
                    System.out.println("Delivery : " + makanan [i][j]);
                    break;
                    case 2:
                    harga [i] = (makanan [i][j] + taxTakeout) * menu [i];
                    jumlahMakanan [i] += makanan [i][j];
                    jumlahHarga [i] += harga [i];
                    System.out.println("Takeout : " + makanan [i][j]);
                    break;

                } 
                total += jumlahHarga [i];
            } 
            System.out.println ("total penjualan makanan " + nama [i] + " : " + jumlahMakanan [i]);
            System.out.println("=====================================================");
        } 
        System.out.println("Rata - rata penjualan makanan khas madura adalah : " + (jumlahMakanan [4] / 3));
        System.out.println("Makanan terlaris yang menggunakan layanan delivery adalah Korean Food dengan penjualan sebanyak : " + max [1]);
        System.out.println("Makanan paling tidak laku yang menggunakan delivery adalah Khas Jogja dengan penjualan sebanyak : " + min [1]);
        System.out.println("Total pemasukan dalam satu hari sebnyak : " + jumlahHarga[1]);
        

    }
}
