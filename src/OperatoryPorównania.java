import java.util.Scanner;

public class OperatoryPorównania {

    public static void main(String[] args) {/*        int firstNumber = 4;
        int secondNumber = 6;*/

        Scanner scanner =new Scanner(System.in);
        System.out.println("Prosze podaj pierwszą liczbę");
        int firstNumber = scanner.nextInt();
        System.out.println("Prosze podaj drugą liczbę");
        int secondNumber = scanner.nextInt();
        System.out.println("Poniżej przestawiam wyniki: ");

        System.out.println("Czy pierwsza liczba jest większa od drugiej?");
        System.out.println(firstNumber > secondNumber); //false
        System.out.println("Czy pierwsza liczba jest mniejsza od drugiej?");
        System.out.println(firstNumber < secondNumber); //true
        System.out.println("Czy pierwsza liczba jest większa lub równa drugiej?");
        System.out.println(firstNumber >= secondNumber); //false
        System.out.println("Czy pierwsza liczba jest mniejsza lub równa drugiej?");
        System.out.println(firstNumber <= secondNumber); //true
        System.out.println("Czy pierwsza liczba jest równa drugiej?");
        System.out.println(firstNumber == secondNumber); //false
        System.out.println("Czy podane liczby różnią się od siebie?");
        System.out.println(firstNumber != secondNumber); //true
    }
}
