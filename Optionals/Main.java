package Optionals;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        // Cat myCat = findCatByName("fatty cat");
        /*
        if(myCat != null)
            System.out.println(myCat.getAge());
        else
            System.out.println(0);
        * */

        Optional<Cat> optionalCat = findCatByName("food");
        /*
        if(optionalCat.isPresent())
            System.out.println(optionalCat.get().getAge());
        else
            System.out.println(0);
        */

         Cat myCat = optionalCat.orElse(new Cat("UNKNOWN",0));

    }

    // method in main class
    private static Optional<Cat> findCatByName(String name) {
        Cat cat = new Cat(name, 0);
        return Optional.ofNullable(null); // return Cat object
        // return Optional.of(cat); // Non-nullable object
    }
}
