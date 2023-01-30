//umożliwiają wykonanie podstawowych operacji matematycznych
public class OperatoryMatematyczne {

    public static void main(String[] args) {
        int firstNumber = 4;
        int secondNumber = 6;
        float thirdNumber = 4.0F;

        int addition = firstNumber + secondNumber;
        int substration = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
        float division = thirdNumber / secondNumber;
        int mod = secondNumber % firstNumber;

/*        System.out.println("Wynik dodawania: " +addition);
        System.out.println("Wynik odejmowania: " +substration);
        System.out.println("Wynik mnożenia: " +multiplication);
        System.out.println("Wynik dzielenia: " +division);
        System.out.println("Wynik Modulo: " +mod);*/

        firstNumber+=secondNumber;
        System.out.println("Po dodaniu: " +firstNumber);
        firstNumber-=secondNumber;
        System.out.println("Po odejmowaniu: " +firstNumber);
        firstNumber*=secondNumber;
        System.out.println("Po mnożeniu: " +firstNumber);
        firstNumber/=secondNumber;
        System.out.println("Po dzieleniu: " +firstNumber);
        firstNumber%=secondNumber;
        System.out.println("Po modulo: " +firstNumber);

    }
}
