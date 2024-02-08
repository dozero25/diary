package diary.diary.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Map;

@AllArgsConstructor
@Getter
public class CustomErrorException extends RuntimeException{
    private Map<String, String> errorMap;
}
