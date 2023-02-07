public class FinalTest {

    // klasy final nie można zmodyfikować

    public static void main(String[] args) {
        final int x = 2;
        //int x = 3;

        final Person person = new Person("Tim", 26);
        person.age = 25;

        //person = new Person("Rafał", 76);
    }
}
