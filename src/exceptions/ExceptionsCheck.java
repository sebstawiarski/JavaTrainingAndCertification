package exceptions;

import java.util.Scanner;

public class ExceptionsCheck {

    public static void main(String[] args) throws InvalidAgeException {

        System.out.println("Podaj swój wiek: ");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age < 0) {
            throw new InvalidAgeException("Your age is not valid");
        }
        if (age >= 18) {
            System.out.println("Jesteś pełnoletni");
        } else {
            System.out.println("Nie jesteś pełnoletni");
        }

    }
}