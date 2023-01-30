
//instrukcje warunkowe pozwalają nam określić które części kodu mają zostać wykonane, gdy zostanie spełniony warunek
public class InstrukcjaWarunkowaIfElse {

    public static void main(String[] args) {
        float dzielna = 4.0F;
        float dzielnik = 2.0F;

        if(dzielnik !=0) {
            System.out.println("Wynik dzielenia to: " +dzielna/dzielnik);
        } else {
            System.out.println("Proszę podaj inną liczbę.");
        }


    }
}
