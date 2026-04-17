package lest.dev.UserService.domain.port;

import lest.dev.UserService.domain.model.entities.UserDomain;

public interface UserDomainPort {

    UserDomain createUser(UserDomain user);
    UserDomain findUser(UserDomain user);
    UserDomain updateUser(UserDomain user);
    UserDomain deleteUser(UserDomain user);

}
