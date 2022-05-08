import java.util.ArrayList;
import java.util.List;

public class TabliceLista {

    public static void main(String[] args) {
        List<Integer> listaa = new ArrayList<>();
        for (int i = 0; i <= 100; i++) {
            if (i%2==0)
                listaa.add(i*2);
                else
                    listaa.add(i);
            System.out.println(listaa.get(i));
        }


//        int[] tablica = int[100];
//        for (int i = 0; i < 100; i++)
//            tablica[i] = 1+1;
//        int zmenna = tablica[3];
//        for (int i = 0; i< tablica; i++)
//            System.out.println(tablica[i]);
    }
}
// wersja z foreach do mnozenia

//List<Integer> list2 = new ArrayList<>();
//for (int i=0 ; i<=listaa); i++)
//list2.add(i);
//for (int v: list2)
//    if (v%2 == 0)
//        list2.set(v, v*2);
//for (int v : list2)
//    System.out.println(v);

