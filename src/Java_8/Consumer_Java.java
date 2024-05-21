package Java_8;

import java.util.function.Consumer;


public class Consumer_Java {

    public static void main(String[] args) {

        Consumer<String> consumer = (input) -> System.out.println(input);
        consumer.accept("Hello Ashish");

    }
}
