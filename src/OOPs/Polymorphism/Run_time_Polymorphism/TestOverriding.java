package OOPs.Polymorphism.Run_time_Polymorphism;

class Animal {

    void sound (){
        System.out.println("This is the generic sound of the animal");
    }
}
class Dog extends Animal{

    void sound(){
        System.out.println("The dog can bark");
    }
}
class Cat extends Animal {
    void sound (){
        System.out.println("The cat can do meow");
    }
}

public class TestOverriding {

    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.sound();
        myCat.sound();
    }
}
