import java.util.Scanner;
public class Tugas3_Indra {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        float suhu, celcius, reaumur, fahrenheit, kelvin;
        System.out.print("Masukkan suhu : ");
        suhu = sc.nextFloat();
        celcius = suhu;
        reaumur = 0.8F * celcius;
        fahrenheit = 1.8F * celcius + 32;
        kelvin = celcius + 273;

        System.out.println("Suhu dalam celcius adalah : " + celcius + "°C");
        System.out.println("Suhu dalam reaumur adalah : " + reaumur + "°R");
        System.out.println("Suhu dalam fahrenheit adalah : " + fahrenheit + "°F");
        System.out.println("Suhu dalam kelvin adalah : " + kelvin + "°K");
    }

}
