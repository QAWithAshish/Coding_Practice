package OOPs.Abstraction;

/*
An interface in Java is a reference type, similar to a class, that can contain only abstract
methods (prior to Java 8) and static or default methods (since Java 8).
Interfaces are implemented by classes to provide the behavior defined by the interface.
*/

interface Animals {

    void sound();

    default void sleep() {
        System.out.println("This animal is sleeping.");
    }
}

class Dogs implements Animals {


    public void sound() {
        System.out.println("The dogs bark");
    }
}

class Cats implements Animals {

    public void sound() {
        System.out.println("The cats meows");
    }
}

public class TestInterface {
    public static void main(String[] args) {
        Animals myDog = new Dogs();
        Animals myCat = new Cats();

        myDog.sound();  // Calls the sound method of Dog class
        myDog.sleep();  // Calls the sleep method of Animal interface

        myCat.sound();  // Calls the sound method of Cat class
        myCat.sleep();  // Calls the sleep method of Animal interface
    }
}
