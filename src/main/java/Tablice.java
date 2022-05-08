import java.util.Scanner;

public class Tablice {
    public static void main(String[] args) {
     int iloscElementow;
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbe elementow");
        iloscElementow = in.nextInt();
        int[] tablica = new int[iloscElementow];
        for (int i =0; i< tablica.length; i++) {
            tablica[i] = i*2;
            System.out.println(tablica[i]);
        }
    }
}

