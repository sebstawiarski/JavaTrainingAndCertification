package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("test.txt");
        Scanner myReader = new Scanner(file);
        while(myReader.hasNext()) {
            String line = myReader.next();
            System.out.println(line);
        }
        myReader.close();
    }
}
