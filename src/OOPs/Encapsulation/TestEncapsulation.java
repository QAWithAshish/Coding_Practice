package OOPs.Encapsulation;


class Person {
    // Private variables
    private String name;
    private int age;

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        if (age > 0) { // Simple validation
            this.age = age;
        } else {
            System.out.println("Age must be positive.");
        }
    }
}

public class TestEncapsulation {
    public static void main(String[] args) {
        Person person = new Person();

        // Using setters to set values
        person.setName("Alice");
        person.setAge(30);

        // Using getters to get values
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        // Attempting to set an invalid age
        person.setAge(-5);  // Should print "Age must be positive."
    }
}
