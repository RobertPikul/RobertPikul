import java.util.Scanner;

public class OdliczanieWhile {
    public static void main(String[] args) throws InterruptedException {
        int czas;
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj czas");
        czas = in.nextInt();
//        for (int i = czas; i > 0; i--) {
//            Thread.sleep(100);
//            System.out.println("Bomba wybuchnie za sekund " + i);
        while (czas>0) {
            System.out.println("Bomba za sekund " );
            czas--;
        }
    }
}