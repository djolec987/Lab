package rs.codecraft.lab.adapters.database.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import rs.codecraft.lab.adapters.database.entity.UserDao;
import rs.codecraft.lab.core.entity.User;

@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    User userDaoToUser(UserDao userDao);

}
