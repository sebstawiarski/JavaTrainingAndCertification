public class PersonTest {

    public static void main(String[] args) {
        MathTeacher teacher = new MathTeacher("Tom", 29, "University");
        teacher.walk();
        teacher.eat();
        teacher.teachMath();
        teacher.school = "University";
        teacher.sayHello();

        Footballer footballer = new Footballer("Mike", 21, "Boca Juniors");
        footballer.walk();
        footballer.eat();
        footballer.footballClub = "Boca Juniors";
        footballer.playFootball();

    }
}
