package identifiers.second;

import identifiers.first.Parent;

public class Random {

    // klasa w innej paczce nie ma dostępu do pól/metod private oraz default czyli bez identyfikatora oraz protected
    Parent parent = new Parent();
    public void testIdentifiers() {

        System.out.println(parent.first);
        //System.out.println(parent.second);
        //System.out.println(parent.third);
        //System.out.println(parent.fourth);
        parent.firstMethod();
        //parent.secondMethod();
        //parent.thirdMethod();
        //parent.fourthMethod();
    }
}
