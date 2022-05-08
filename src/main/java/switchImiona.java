import java.util.Scanner;

public class switchImiona {
    public static void main(String[] args) {
        String imie;
        Scanner in = new Scanner(System.in);
        System.out.print("Podaj imie: ");
        imie = in.nextLine();
        String odpowiedz = "Witaj ";
        switch (imie) {
            case "Adam":
                odpowiedz += imie;
                break;
            case "Ewa":
                odpowiedz += imie;
                break;
            default:
                odpowiedz = "Przykro mi, ale Cię nie znam";
        }
        System.out.println(odpowiedz);
    }
}
