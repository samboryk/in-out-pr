import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFiles {
    public static void main(String[] args) {
        try {
            FileInputStream in = new FileInputStream("C:\\Users\\dmytr\\IdeaProjects\\pr-in-out\\src\\source.txt");
            FileOutputStream out = new FileOutputStream("C:\\Users\\dmytr\\IdeaProjects\\pr-in-out\\src\\dest.txt");

            int b;
            while ((b = in.read()) != -1) {
                out.write(b);
            }

            in.close();
            out.close();

            System.out.println("копіювання завершено");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
