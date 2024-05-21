package Java_8;


interface Shape {
    void draw();
}

class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Its rectangle");
    }
}


public class Lambda_Expression {

    public static void main(String[] args) {

    /*    // Lambda_Expression Without parameters
        Shape circle = () -> System.out.println("Its circle ");
      //  circle.draw();

        Shape square = () -> System.out.println("Its square");
      //  square.draw();

        Shape rectangle = () -> System.out.println("Its rectangle");
       // rectangle.draw();*/

        // Lambda_Expression with parameters
        print(() -> System.out.println("Its circle "));
        print(() -> System.out.println("Its square"));
        print(() -> System.out.println("Its rectangle"));


    }

    private static void print(Shape shape){
        shape.draw();
    }

}
