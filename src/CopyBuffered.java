import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyBuffered {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\dmytr\\IdeaProjects\\pr-in-out\\src\\source.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\dmytr\\IdeaProjects\\pr-in-out\\src\\dest.txt"));

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
            reader.close();
            writer.close();

            System.out.println("Копіювання з буфером завершено!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
