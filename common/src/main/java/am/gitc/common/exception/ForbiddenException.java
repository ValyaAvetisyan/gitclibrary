package am.gitc.common.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by Zorik Zaqaryan on 14.03.2016.
 */

@ResponseStatus(HttpStatus.FORBIDDEN)
public class ForbiddenException extends HttpException {
    public ForbiddenException() {
    }

    public ForbiddenException(String message) {
        super(message);
    }

    public ForbiddenException(String message, Throwable cause) {
        super(message, cause);
    }
}
