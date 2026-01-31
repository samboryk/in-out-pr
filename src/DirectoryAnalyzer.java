import java.io.File;

public class DirectoryAnalyzer {

    public static void main(String[] args) {
        String path = "D:\\New Folder";

        File folder = new File(path);

        if (!folder.exists()) {
            System.out.println("директорія не існує!");
            return;
        }

        if (!folder.isDirectory()) {
            System.out.println("не директорія!");
            return;
        }

        System.out.println("txt файли:\n");
        findTxtFiles(folder);
    }

    public static void findTxtFiles(File dir) {
        File[] files = dir.listFiles();

        if (files == null) return;

        for (File file : files) {
            if (file.isDirectory()) {
                findTxtFiles(file);
            } else {
                if (file.getName().toLowerCase().endsWith(".txt")) {
                    System.out.println(file.getAbsolutePath());
                }
            }
        }
    }
}
