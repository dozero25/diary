package diary.diary.service;

import diary.diary.repository.RegisterRepository;
import diary.diary.web.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterService {

    @Autowired
    private RegisterRepository registerRepository;

    public int registerUser(UserDto userDto){
        return registerRepository.registerUser(userDto);
    }

}
