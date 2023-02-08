package lambda;

public class StudentTest {

    public static void main(String[] args) {

    Student it = new ItStudent();
    sayHello("John", it, 21);

    Student med = new Student() {
        @Override
        public void sayHello(String name, int age) {
            System.out.println("I will be a doc");
            System.out.println("My name is " + name);
        }
    };

    sayHello("Kate", med, 31);

    // (paramentr) --> System.out.println("Im not a student. My name is " + name);

        Student noStudent = (name,age) -> {
            System.out.println("Im not a student. My name is " + name + "." + " I am " + age + " years old");
            if(age>18) {
            System.out.println("You can buy a beer");
            }
        };
        sayHello("Tom", noStudent, 31);

    }

    public static void sayHello(String name, Student student, int age) {
        student.sayHello(name, age);
    }
}
