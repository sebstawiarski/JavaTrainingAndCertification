import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Prosze podaj pierwszą liczbę");
        int firstNumber = scanner.nextInt();
        System.out.println("Prosze podaj drugą liczbę");
        int secondNumber = scanner.nextInt();

        Calculator calculator = new Calculator();

        int addition = calculator.add(firstNumber,secondNumber);
        int substration = calculator.sub(firstNumber,secondNumber);
        int multiplication = calculator.mult(firstNumber,secondNumber);
        int division = calculator.div(firstNumber,secondNumber);
        int mod = calculator.mod(firstNumber,secondNumber);

        System.out.println("Wynik dodawania: " +addition);
        System.out.println("Wynik odejmowania: " +substration);
        System.out.println("Wynik mnożenia: " +multiplication);
        System.out.println("Wynik dzielenia: " +division);
        System.out.println("Wynik modulo: " +mod);

    }
}
