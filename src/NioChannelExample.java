import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NioChannelExample {
    public static void main(String[] args) {

        try (FileInputStream fis = new FileInputStream("C:\\Users\\dmytr\\IdeaProjects\\pr-in-out\\src\\source.txt");
             FileChannel channel = fis.getChannel()) {

            ByteBuffer buffer = ByteBuffer.allocate(64);

            while (channel.read(buffer) > 0) {

                buffer.flip();

                while (buffer.hasRemaining()) {
                    System.out.print((char) buffer.get());
                }

                buffer.clear();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
