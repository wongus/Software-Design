import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Console {

    public Console() {
        try {
            System.setOut(new PrintStream(new File("studenten.txt")));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void log(String message) {
        System.out.println(message);
    }
}
