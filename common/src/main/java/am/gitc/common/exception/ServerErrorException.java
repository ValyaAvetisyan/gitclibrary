package am.gitc.common.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by Zorik Zaqaryan on 14.03.2016.
 */
@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class ServerErrorException extends HttpException {
    public ServerErrorException() {
    }

    public ServerErrorException(String message) {
        super(message);
    }

    public ServerErrorException(String message, Throwable cause) {
        super(message, cause);
    }
}
