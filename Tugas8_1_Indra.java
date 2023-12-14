import java.util.Scanner;
public class Tugas8_1_Indra {
    public static void main (String [] args){

        Scanner input = new Scanner(System.in);
        int [] array19 = new int [5];

        for (int i = 0; i < array19.length; i++) {
            System.out.print("Masukan nilai arrray ke - " + i  + " : ");
            array19 [i] = input.nextInt();
        }

        System.out.println("Nilai array akan dibalik...");

        int [] newArray19 = new int [5];
        int j = 0;

        for (int i = (newArray19.length - 1); i >= 0; i--) {
            while (j < newArray19.length) {
                newArray19 [j] = array19 [i];
                System.out.println("Nilai arrray ke - " + j  + " setelah dibalik : " + newArray19 [j]);
                j++;
                break;
            }
        }
    }
}
