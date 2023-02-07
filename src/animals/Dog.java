package animals;

public class Dog extends Animal{
    @Override
    public void sound() {
        System.out.println("Woof!");
        sayHello();
        System.out.println("Number of legs " + legs);
    }
}
