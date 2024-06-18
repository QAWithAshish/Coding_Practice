package OOPs.Polymorphism.Compile_time_Polymorphism;

/*
Key Points

Polymorphism allows for methods to do different things based on the object it is acting upon.
Compile-time Polymorphism (or static polymorphism) is achieved by method overloading. It is resolved during the compilation of the program.
Run-time Polymorphism (or dynamic polymorphism) is achieved by method overriding. It is resolved during the runtime of the program.
Method Overloading allows multiple methods with the same name but different parameters.
Method Overriding allows a subclass to provide a specific implementation for a method already defined in its superclass.
Virtual Method Invocation: In Java, method calls are always resolved at runtime, ensuring the appropriate overridden method is executed based on the actual object type, not the reference type.

Advantages of Polymorphism

- Code Reusability: It allows you to reuse code without rewriting it for different types.
- Flexibility and Maintenance: It allows you to write more flexible and maintainable code.
- Extensibility: It allows new functionality to be added with minimal changes to existing code.
*/
class MathOperations {

    // Method to add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add two double values
    double add(double a, double b) {
        return a + b;
    }
}

public class TestOverloading {

    public static void main(String[] args) {
        MathOperations math = new MathOperations();

        System.out.println(math.add(5, 10));       // Calls the method with two int parameters

        System.out.println(math.add(5, 10, 15));  // Calls the method with three int parameters

        System.out.println(math.add(5.5, 10.5));   // Calls the method with two double parameters

    }

}
