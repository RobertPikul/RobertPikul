import java.util.Scanner;


public class ZadanieDomowe1 {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in); // Pobieramy z konsoli liczbę którą chcemy sprawdzić
        double liczba = n.nextDouble() ; //Scanner pobiera plik typu STRING dlatego używamy metody nextInt() do zamiany na liczbę całkowitą
        boolean pierwsza= true; //Zakładamy pierwotnie, że jest pierwszą
        for(int i=2; i<Math.sqrt(n); i++){ //Sprawdzamy dla każdej liczby od 2 do pierwiastka z n, czy n jest podzielne przez nią
            if((liczba % i == 0)){
                pierwsza = false; //Jeśli liczbę możemy podzielić przez inną liczbę niż 1 i nią samą to NIE JEST LICZBA PIERWSZA
            }

        }
        if(pierwsza)System.out.println("Liczba " + liczba + " Jest liczbą pierwszą");
        else System.out.println("Liczba " + liczba + " Nie jest liczbą pierwszą");

    }

    }

