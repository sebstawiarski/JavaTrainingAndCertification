
//Inkrementacja - zwiększanie wartości o 1
public class InkrementacjaDekrementacja {

    public static void main(String[] args) {

        int a = 0;
        System.out.println("Wartość a: " + a);
        int b = a++;
        System.out.println("Wartość b: " + b);
        System.out.println("Wartość a: " + a);
        int c = ++a;
        System.out.println("Wartość c: " + c);
        System.out.println("Wartość a: " + a);

//Dekrementacja - zmniejszanie wartości o 1

        int d = 0;
        System.out.println("Wartość d: " + d);
        int e = d--;
        System.out.println("Wartość e: " + e);
        System.out.println("Wartość d: " + d);
        int f = --d;
        System.out.println("Wartość f: " +f);
        System.out.println("Wartość d: " +d);
    }
}
