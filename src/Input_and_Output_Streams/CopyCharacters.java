package Input_and_Output_Streams;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyCharacters {
    public static void main(String[] args) throws IOException {

        FileReader inputStream = null;
        FileWriter outputStream = null;

        try {
            inputStream = new FileReader("C:\\Users\\prave\\IdeaProjects\\java-programs\\src\\Input_and_Output_Streams\\xanadu.txt");
            outputStream = new FileWriter("C:\\Users\\prave\\IdeaProjects\\java-programs\\src\\Input_and_Output_Streams\\characteroutput.txt");

            int c;
            while ((c = inputStream.read()) != -1) {
                outputStream.write(c);
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}
