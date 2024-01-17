package kim.nzxy.demo.ex;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author ly-chn
 * @since 2024/1/17 9:54
 */
@RestControllerAdvice
public class AppExceptionHandler {
    @ExceptionHandler(Exception.class)
    public String handler(Exception e) {
        return "Some error happened: " + e.getMessage();
    }
}
