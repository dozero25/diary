package diary.diary.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@AllArgsConstructor
@Data
public class UserDto {

    private int userNum;
    private String username;
    private String userId;
    private String userPassword;
    private String userEmail;
    private int userPhone;
    private LocalDate userRegDate;

}
