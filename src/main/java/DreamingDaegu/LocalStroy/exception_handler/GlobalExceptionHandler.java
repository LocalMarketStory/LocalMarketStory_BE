package DreamingDaegu.LocalStroy.exception_handler;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.net.UnknownHostException;
import java.util.NoSuchElementException;

import static org.springframework.data.crossstore.ChangeSetPersister.*;
import static org.springframework.http.HttpStatus.*;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler
    @ResponseStatus(BAD_REQUEST)
    public ErrorResponse handleException(NoSuchElementException e) {
        return new ErrorResponse("NoSuchElementException", e.getMessage());
    }

    @ExceptionHandler
    @ResponseStatus(INTERNAL_SERVER_ERROR)
    public ErrorResponse handleException(Exception e) {
        return new ErrorResponse("INTERNAL_SERVER_ERROR", "서버 내부 오류가 발생했습니다.");
    }

    @ExceptionHandler
    @ResponseStatus(NOT_FOUND)
    public ErrorResponse handleException(NotFoundException e) {
        return new ErrorResponse("NOT_FOUND", "잘못된 URL입니다.");
    }

    @ExceptionHandler
    @ResponseStatus(INTERNAL_SERVER_ERROR)
    public ErrorResponse handleException(UnknownHostException e) {
        return new ErrorResponse("UnknownHostException", "서버 IP 주소를 가져올 수 없습니다.");
    }
}
