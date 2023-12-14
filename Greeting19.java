public class Greeting19 {
    static void beriSalam () {
        System.out.println("Halo! Selamat Pagi");
    }
    static void beriUcapan (String ucapan){
        System.out.println(ucapan);
    }
    public static void main (String[]args) {
        //menggunakan fungsi
        beriSalam();

        //tanpa fungsi
        System.out.println("Halo! Selamat Pagi");

        
        String salam = "Selamat datang di pemrograman Java";
        beriUcapan(salam);
    }
}
