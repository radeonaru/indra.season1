import java.util.Scanner;
public class Star {
    public static void main (String [] Args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai N : ");
        int N = sc.nextInt();

        for (int i=0; i>N; i--){
            System.out.print("*"); 
        }
        
    }
}
