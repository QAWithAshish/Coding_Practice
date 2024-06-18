package OOPs.Inheritance.Hybrid_Inheritance;


/*
Hybrid inheritance is a combination of two or more types of inheritance.
Java does not support multiple inheritance directly,
so hybrid inheritance is often achieved using interfaces.
*/

interface Animal {
    void eat();
}

class Mammal implements Animal {
    public void eat() {
        System.out.println("This mammal eats food.");
    }
}

interface Pet {
    void play();
}

class Dog extends Mammal implements Pet {
    public void bark() {
        System.out.println("The dog barks.");
    }

    public void play() {
        System.out.println("The dog plays.");
    }
}

public class TestHybridInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();  // Inherited from Mammal
        d.bark();
        d.play(); // Inherited from Pet
    }
}

