package practic;

public class Demo {

    public void click(String str){
        System.out.println("Click from Parent" +str);
    }

}

class child {

    public void click(String str){
        System.out.println("Click from Parent" +str);
    }

    public static void main(String[] args) {

    }
}