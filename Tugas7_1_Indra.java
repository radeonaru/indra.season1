import java.util.Scanner;
public class Tugas7_1_Indra {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai N = ");
        int N1 = sc.nextInt();
        int i = 1;

        if (N1>=3) {

        while(i <= N1) {
            int space = (N1-i);
        while(space > 0) {
            System.out.print(" ");
            space--;
        }
        int N2=0;
        while (N2<i) {
        System.out.print(N2+1);
        N2++;
    }
    System.out.println();
    i++;
    }
    
}
}
}
