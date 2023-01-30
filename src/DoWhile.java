public class DoWhile {
    public static void main(String[] args) {

        int number = 21;
        do {
            //najpierw wypisanie komunikatu, potem sprawdzenie
            System.out.println("Moja wartość to: " + number + " i jestem większa od 20");
            number++;
        } while (number<20);//nieprawidłowy wynik
    }
}
