package OOPs.Abstraction;

/*
An abstract class is a class that cannot be instantiated on its own and is meant to be subclassed.
It can contain both abstract methods (methods without a body) and concrete methods (methods with an implementation).
*/

abstract class Animal {

    // Abstract method (does not have a body)
    abstract void sound();

    // Concrete method
    void sleep() {
        System.out.println("Animal do sleep");
    }

}

class Dog extends Animal {

    // Provide implementation for the abstract method
    void sound() {
        System.out.println("The Dog barks");
    }
}

class Cat extends Animal {

    // Provide implementation for the abstract method
    void sound() {
        System.out.println("The cats meows");
    }
}

public class TestAbstractClass {

    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.sound();  // Calls the sound method of Dog class
        myDog.sleep();  // Calls the sleep method of Animal class

        myCat.sound();  // Calls the sound method of Cat class
        myCat.sleep();  // Calls the sleep method of Animal class
    }
}
