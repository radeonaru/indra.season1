public class Tugas9_1_Indra {
    public static void main (String [] args){
        char place [][] = new char [8][5];
        char [] word = {'M','u','h','a','m','m','a','d','B','a','g','u','s','I','n','d','r','a','w','a','n'};

        int data = 0;
        for (int i = 0; i < place.length; i++){
            for (int j = 0; j < place[0].length; j++) {
                if (data < word.length){
                    place [i][j] = word [data];
                    data++;
                } else {
                    data = 0;
                    place [i][j] = word [data];
                    data++;
                }
            }
        }
        System.out.println();

        for (int i = 0; i < place.length; i++){
            for (int j = 0; j < place[0].length; j++) {
                System.out.print(place [i][j] + " ");
            }
            System.out.println();
        }
    }
}
