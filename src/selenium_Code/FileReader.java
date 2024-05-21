package selenium_Code;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileReader {

    public static void main(String[] args) {

        File file = new File("myFile.txt");
        if (file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        try {
            FileWriter fw =new FileWriter(file);
            fw.write("Hello Ashish ");
            fw.flush();
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
