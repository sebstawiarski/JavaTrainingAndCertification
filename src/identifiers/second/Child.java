package identifiers.second;

import identifiers.first.Parent;

public class Child extends Parent {

    // klasa potomna w innej paczce nie ma dostępu do pól/metod private oraz default czyli bez identyfikatora
    public void testIdentifier() {
        System.out.println(first);
        //System.out.println(second);
        System.out.println(third);
        //System.out.println(fourth);
        firstMethod();
        //secondMethod();
        thirdMethod();
        //fourthMethod();
    }

}
