package diary.diary.web.api;

import diary.diary.service.RegisterService;
import diary.diary.web.dto.CMRespDto;
import diary.diary.web.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/register")
public class RegisterApi {

    @Autowired
    private RegisterService registerService;

    @PostMapping("/reg")
    public ResponseEntity<? extends CMRespDto<?>> registerUser(UserDto userDto){
        registerService.registerUser(userDto);

        return ResponseEntity
                .ok()
                .body(new CMRespDto<>(HttpStatus.OK.value(), "Successfully", true));
    }
}
