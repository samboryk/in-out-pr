import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class NioReadLinesExample {
    public static void main(String[] args) {
        Path path = Path.of("C:\\Users\\dmytr\\IdeaProjects\\pr-in-out\\src\\source.txt");

        try {
            List<String> lines = Files.readAllLines(path);

            for (String line : lines) {
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
