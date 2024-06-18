package OOPs.Inheritance.Multilevel_Inheritance;


class Animal {
    void eat() {
        System.out.println("Animals can eat ");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dogs can bark ");
    }
}

class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy's can weep out");
    }
}


public class TestMultilevelInheritance {

    public static void main(String[] args) {
        Puppy puppy =new Puppy();
        puppy.eat();
        puppy.bark();
        puppy.weep();
    }

}
