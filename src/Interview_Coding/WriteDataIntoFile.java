package Interview_Coding;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataIntoFile {

    //How to write the data for notepad? write the code ?

    public static void main(String[] args) throws IOException {

        String filePath = "output.txt";

        String data = "Hello, Ashish!\\nThis is a test data for Notepad file.";

        try(BufferedWriter writer =new BufferedWriter(new FileWriter(filePath))){
            writer.write(data);
            System.out.println("Data is written in output.txt file");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
