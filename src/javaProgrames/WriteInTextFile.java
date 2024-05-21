package javaProgrames;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteInTextFile {

    public static void main(String[] args) throws IOException {

//        File file=new File("/Users/apple/Desktop/textDemoWrite.txt");
//        FileWriter fileWriter=new FileWriter(file);
//        BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
//
//
//        bufferedWriter.write("Hello Ashish");
//        bufferedWriter.newLine();
//        bufferedWriter.write("How are you !!!!");
//        bufferedWriter.newLine();

        String text = "Hello, Ashish!";
        String filePath = "/Users/apple/Desktop/file.txt";

        try {
            FileWriter writer = new FileWriter(filePath);
            writer.write(text);
            writer.close();
            System.out.println("Successfully wrote to file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
