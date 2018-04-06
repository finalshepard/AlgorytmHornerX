import java.util.Scanner;
import java.util.ArrayList;

public class Pierwiastek {
    private ArrayList<Float> tablica = new ArrayList<>();
    private int p;

    public Pierwiastek(int potega)
    {
        p=potega;
    }

    float licz()
    {


            int n=1 ;
            float ef = tablica.get(0);
        do {
            System.out.println("Podaj punkt x");
            Scanner in = new Scanner(System.in);
            if (in.hasNextFloat()) {
                float iks = in.nextFloat();
                n = 1;
                do {
                    ef = ef * iks + tablica.get(n);
                    n++;
                } while (n < tablica.size());
            }else
                System.out.println("Błędna wartosc. Spróbuj ponownie");


        }while(n==1);
        return ef;
    }

    void podaj_liczbe()     //proba z floatem
    {
        do {
            System.out.println("Podaj liczbę przed x o potędze " + p);
            Scanner elo = new Scanner(System.in);
            if(elo.hasNextFloat())
            {
                float liczba = elo.nextFloat();
                tablica.add(liczba);
                p--;
            }else
            System.out.println("Podałeś zły typ! Spróbuj ponownie. ");
        }while(p>=0);
    }
}
