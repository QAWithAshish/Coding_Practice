package Java_8;

interface Addable{
    int addition(int a, int b);
}

public class Lambda_Parameters {

    public static void main(String[] args) {

        Addable addition = ( a , b) -> ( a + b);
        int result = addition.addition(14, 234);
        System.out.println("Sum is :: "+result);
    }


}

