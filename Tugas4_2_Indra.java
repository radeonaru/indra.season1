import java.util.Scanner;
public class Tugas4_2_Indra {
    public static void main(String [] Args) {
    Scanner input= new Scanner(System.in);

    int umur;
    System.out.println("Masukkan umur anda : ");
    umur=input.nextInt();

    if (umur >= 17) {
        System.out.println("Anda boleh berkendara");
    }

    else {
        System.out.println("Anda tidak boleh berkendara");
    }
    
    }

}