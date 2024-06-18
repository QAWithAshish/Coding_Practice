package OOPs.Inheritance.Single_Inheritance;

/*
Key Points
Inheritance allows code reuse by inheriting properties and methods from an existing class.
Single Inheritance involves one base class and one derived class.
Multiple Inheritance is not directly supported in Java but can be implemented using interfaces.
Multilevel Inheritance involves a class inheriting from another derived class.
Hierarchical Inheritance involves multiple classes inheriting from a single base class.
Hybrid Inheritance is a combination of two or more inheritance types and can be achieved using interfaces in Java.

***********************************************************************************

Single inheritance is when a class inherits from one base class
*/

class Animal {

    void eat() {
        System.out.println("This animal eats food.");
    }

    void run() {
        System.out.println("This can run.");
    }

}

class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class TestSingleInheritance {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat(); // Method inherited from Animal class
        dog.run(); // Method inherited from Animal class
        dog.bark();
    }
}