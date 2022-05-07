import java.util.Scanner;

public class PorownanieRP {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbę a: ");
        a = in.nextInt();
        System.out.println("Podaj liczbę b: ");
        b = in.nextInt();
        if(a>b)
            System.out.println("a jest większa od b ");
        else if (a<b)
            System.out.println("a jest mniejsza od b ");
        else
            System.out.println("a jest równe od b ");
    }
}

//    public static void main(String[] args)
//    int LiczbaA = 2;
//int LiczbaB = 3;
//String porownanie = "x";
//Scanner in = new Scanner(System.in)
//
//    System.out.println("Podaj LiczbaA: ");
//LiczbaA = in.nextInt()
//            System.out.println("Podaj LiczbaA: ");
//            LiczbaB = in.nextInt()
//            if(LiczbaA>LiczbaB)System.out.println("liczczba A jest większa od B ")
//            else if (LiczbaA < "LiczbaB");
//
//    }
