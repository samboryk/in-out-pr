import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class NioCopyExample {
    public static void main(String[] args) {
        Path source = Path.of("C:\\Users\\dmytr\\IdeaProjects\\pr-in-out\\src\\source.txt");
        Path dest = Path.of("C:\\Users\\dmytr\\IdeaProjects\\pr-in-out\\src\\dest.txt");

        try {
            Files.copy(source, dest, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("скопійовано через NIO!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
