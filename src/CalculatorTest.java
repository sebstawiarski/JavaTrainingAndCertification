import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Prosze podaj pierwszą liczbę");
        int firstNumber = scanner.nextInt();
        System.out.println("Prosze podaj drugą liczbę");
        int secondNumber = scanner.nextInt();

        int addition = firstNumber + secondNumber;
        int substration = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
        int division = firstNumber / secondNumber;
        int mod = firstNumber % secondNumber;

        System.out.println("Wynik dodawania: " +addition);
        System.out.println("Wynik odejmowania: " +substration);
        System.out.println("Wynik mnożenia: " +multiplication);
        System.out.println("Wynik dzielenia: " +division);
        System.out.println("Wynik modulo: " +mod);

    }
}
