import java.util.Scanner;

public class AgeChecker {

    public static void main(String[] args) {
        System.out.println("Podaj proszę swój wiek: ");
        Scanner scanner =new Scanner(System.in);
        int age = scanner.nextInt();
        if (age<18 && age>=0) {
            System.out.println("Nie możesz zakupić alkoholu.");
        } else if (age < 0){
            System.out.println("Wprowadź poprawny wiek.");
        } else {
            System.out.println("Dziękujemy a zakupy! Zapraszamy ponownie!");
        }
    }
}
