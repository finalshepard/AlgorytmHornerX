import java.util.Scanner;



public class Horner {

    public static void main(String[] args) {
        boolean meni = true;
        do {
            boolean blad = true;
            Scanner in = new Scanner(System.in);
            System.out.println("Witaj! Wybierz algorytm.\n1.Algorytm Hornera - obliczanie wartosci pierwiastka\n2.Wyjscie");
            if (in.hasNextInt()) {
                int wybor = in.nextInt();
                if (wybor==1)
                {
                    System.out.println("Podaj największą całkowitą potęgę wielomianu: ");
                    if(in.hasNextInt())
                    {
                        int potega = in.nextInt();
                        if(potega>0)
                        {
                            Pierwiastek licz = new Pierwiastek(potega);
                            licz.podaj_liczbe();
                           System.out.println("Szukana liczba to " + licz.licz() + "\n\n");
                            blad=false;
                        }else
                        {
                            System.out.println("Potęga zbyt niska żeby był sens liczyć!\n");
                        }
                    }
                }else if(wybor==2)
                    break;

            }
            if (blad){
                    System.out.println("Wpisałeś zły typ danych lub złą liczbę. Spróbuj ponownie.\n");
                }
        } while (meni);
    }
}
