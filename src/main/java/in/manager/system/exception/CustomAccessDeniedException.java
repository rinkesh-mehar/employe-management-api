package in.manager.system.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author Rinkesh-Mehar
 * @date 06/02/21
 * @time 11:27 AM
 */
@ResponseStatus(HttpStatus.FORBIDDEN)
public class CustomAccessDeniedException extends RuntimeException {

    public CustomAccessDeniedException(String exception){
        super(exception);
    }

}
