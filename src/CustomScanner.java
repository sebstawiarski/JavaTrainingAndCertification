import java.util.Scanner;

public class CustomScanner {

    /*public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Prosze podaj swoje imię");
        String name = scanner.nextLine();
        System.out.println("Cześć " + name + " !");*/

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Prosze podaj pierwszą liczbę");
        int firstNumber = scanner.nextInt();
        int result = firstNumber * firstNumber;
        System.out.println("Kwadrat tej liczby to: " +result);

/*        int firstNumber = scanner.nextInt();
        int result = firstNumber * firstNumber;
        System.out.println("Kwadrat tej liczby to " +result + " !");*/
    }
}
