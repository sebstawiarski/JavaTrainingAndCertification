// przechowują aktualną wartość oraz umożliwiają wykonanie akcji (wywołanie metod) a tych danych
public class TypyObiektowe {


        // liczby staloprzecinkowe
        byte firstNumber = 127;     // 1 bajt   -128 do 127
        short secondNumber = 32689;    // 2 bajty   -32768 do 32767
        int thirdNumber = 32768999;     // 4 bajty      -2 147 483 648 do 2 147 483 647
        long fourthNumber = 214800L;     // 8 bajtow     -2^63 do (2^63)-1

        // liczby zmiennoprzecinkowe
        float fithNumber = 4.99934F;        //  4 bajty - max ok 6-7 liczb po przecinku
        double sixthNumber = 3.999999999999999D; // 8 bajtow - max ok 15 cyfr po przecinku

        //wartość logiczna
        boolean prawda = true;
        boolean falsz = false;

        //pojedynczy znak
        char letter = 'A';

        //ciągi znaków
        String hello = "Hello Sebastian";

}

