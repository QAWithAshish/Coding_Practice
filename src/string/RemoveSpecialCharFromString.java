package string;

public class RemoveSpecialCharFromString {

    public static void main(String[] args) {

        String str = "#$A^%$$s!@#h(*^i$s^&h()^";

        String str2 = "Ash ish Bha al ray";

        String planTxt = str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(planTxt);

        String newStr = str2.replaceAll("\\s", "");
        System.out.println(newStr);

    }
}
