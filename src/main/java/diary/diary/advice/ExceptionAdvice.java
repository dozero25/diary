package diary.diary.advice;

import diary.diary.exception.CustomErrorException;
import diary.diary.web.dto.CMRespDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionAdvice {

    @ExceptionHandler(CustomErrorException.class)
    public ResponseEntity<?> errorException(CustomErrorException e){
        return ResponseEntity
                .ok()
                .body(new CMRespDto<>(HttpStatus.BAD_REQUEST.value(), "error", e.getErrorMap()));
    }
}
