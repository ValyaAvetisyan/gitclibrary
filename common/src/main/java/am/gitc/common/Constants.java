package am.gitc.common;

import am.gitc.common.exception.ServerErrorException;

import java.io.File;
import java.io.IOException;

/**
 * Created by zorikz on 06/06/2016.
 */
public interface Constants {


    static String getPath() {
        try {
            return new File(".").getCanonicalPath();
        } catch (IOException e) {
            throw new ServerErrorException("Can't get application path", e);
        }
    }


    String STORAGE_DIR_PATH = "\\web\\src\\main\\resources\\static\\data\\";
    String FULL_STORAGE_PATH = getPath() + STORAGE_DIR_PATH;
}
