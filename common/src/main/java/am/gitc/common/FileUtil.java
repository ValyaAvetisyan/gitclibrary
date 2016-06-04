package am.gitc.common;

import javax.ws.rs.ServerErrorException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by Zorik Zaqaryan on 04.06.2016.
 */
public class FileUtil {

    public static void createBookFolderById(Long id, String dirPath) {
        try {
            Path path = Paths.get(dirPath + id);
            Files.createDirectories(path);
            Path imagePath = Paths.get(path + "/img");
            Path pdfPath = Paths.get(path + "/pdf");
            Files.createDirectories(imagePath);
            Files.createDirectories(pdfPath);
        } catch (IOException e) {
            throw new ServerErrorException(500);
        }
    }
}
