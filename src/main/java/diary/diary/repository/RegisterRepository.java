package diary.diary.repository;

import diary.diary.web.dto.UserDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RegisterRepository {

    public int registerUser(UserDto userDto);


}
