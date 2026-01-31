import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class NioMoveExample {
    public static void main(String[] args) {
        Path source = Path.of("C:\\Users\\dmytr\\IdeaProjects\\pr-in-out\\src\\sourse.txt");
        Path dest = Path.of("C:\\Users\\dmytr\\IdeaProjects\\pr-in-out\\src\\New folder\\dest.txt");

        try {
            Files.move(source, dest, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("файл переміщено!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
