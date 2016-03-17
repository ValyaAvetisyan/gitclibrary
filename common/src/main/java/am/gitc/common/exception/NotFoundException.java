package am.gitc.common.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by Zorik Zaqaryan on 14.03.2016.
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class NotFoundException extends HttpException {
    public NotFoundException() {
    }

    public NotFoundException(String message) {
        super(message);
    }

    public NotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
