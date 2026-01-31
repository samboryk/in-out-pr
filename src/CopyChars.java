import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyChars {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("C:\\Users\\dmytr\\IdeaProjects\\pr-in-out\\src\\source.txt");
            FileWriter writer = new FileWriter("C:\\Users\\dmytr\\IdeaProjects\\pr-in-out\\src\\dest.txt");

            int c;
            while ((c = reader.read()) != -1) {
                writer.write(c);
            }

            reader.close();
            writer.close();

            System.out.println("копіювання завершено");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
