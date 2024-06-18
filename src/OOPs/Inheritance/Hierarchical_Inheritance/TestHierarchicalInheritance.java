package OOPs.Inheritance.Hierarchical_Inheritance;

/*
Hierarchical inheritance is when multiple classes inherit from a single base class.
*/
class Animal {
    void eat() {
        System.out.println("Animals can eat");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dogs can bark");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Cats can do meow");
    }
}


public class TestHierarchicalInheritance {

    public static void main(String[] args) {

        Dog dog =new Dog();
        dog.eat();
        dog.bark();

        Cat cat =new Cat();
        cat.eat();
        cat.meow();
    }
}
