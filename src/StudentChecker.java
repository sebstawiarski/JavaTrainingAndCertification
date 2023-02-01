import java.util.Scanner;

public class StudentChecker {

    public static void main(String[] args) {

        Student adam = new Student();
        adam.imie = "Adam";
        adam.nazwisko = "Adamski";
        adam.numerIndeksu = 231321;
        adam.email = "adamadamski@outlook.com";
        adam.nick = "AdamskiA";

        Student aga = new Student();
        aga.imie = "Aga";
        aga.nazwisko = "Kowalska";
        aga.numerIndeksu = 251351;
        aga.email = "agakowalska@outlook.com";
        aga.nick = "AgaK";

        Student sebastian = new Student();
        sebastian.imie = "Sebastian";
        sebastian.nazwisko = "Stawiarski";
        sebastian.numerIndeksu = 211021;
        sebastian.email = "seb.stawiarski@outlook.com";
        sebastian.nick = "SebastianS";

        Student[] students = new Student[3];
        students[0] = adam;
        students[1] = aga;
        students[2] = sebastian;

        for (int i =0; i < students.length; i++) {

            students[i].przedstawSie();
            students[i].podajEmail();
            students[i].podajNrIndeksu();
            students[i].zalogujSie();

        }

    }
}
