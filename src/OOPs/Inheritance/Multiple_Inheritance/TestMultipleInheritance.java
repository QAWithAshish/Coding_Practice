package OOPs.Inheritance.Multiple_Inheritance;


/*
Java does not support multiple inheritance directly due to the diamond problem.
 However, it can be achieved using interfaces.
*/

interface Animal {
    void eat();
}

interface Pet {

    void play();
}

class Dog implements Animal, Pet {


    public void eat() {
        System.out.println("Dog can eat food ");
    }


    public void play() {
        System.out.println("We can play with dog");
    }
}

public class TestMultipleInheritance {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.play();
    }
}