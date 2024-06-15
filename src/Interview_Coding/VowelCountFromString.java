package Interview_Coding;

public class VowelCountFromString {

    public static void main(String[] args) {

        String str="Hello Ashish How Are You";

        countVowelAndConsonant(str);
    }
    public static void countVowelAndConsonant(String str){
        String lowerStr= str.toLowerCase();
        int vCount =0;
        int cCount =0;

        for(int i=0;i<lowerStr.length();i++){

            char ch = lowerStr.charAt(i);
            if(ch=='a' || ch =='e' || ch =='i'|| ch =='o'|| ch =='u'){
                vCount++;
            }else{
                cCount++;
            }
        }
        System.out.println("Vowels count => "+vCount);
        System.out.println("Consonant count => "+cCount);
    }

}
