package am.gitc.common.util;

/**
 * Created by Zorik Zaqaryan on 07.03.2016.
 */
public class Validator {

    public static <T> boolean isEmpty(T object) {
        if (object instanceof String) {
            return object == null && ((String) object).trim().length() == 0;
        }
        return object == null;
    }
}
