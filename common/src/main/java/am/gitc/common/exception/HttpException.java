package am.gitc.common.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by Zorik Zaqaryan on 14.03.2016.
 */
@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class HttpException extends RuntimeException {

    public HttpException() {
    }

    public HttpException(String message) {
        super(message);
    }

    public HttpException(String message, Throwable cause) {
        super(message, cause);
    }
}
