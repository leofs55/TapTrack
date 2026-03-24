package lest.dev.UserService.domain.service.usercase;

import lest.dev.UserService.domain.model.entities.UserDomain;
import org.apache.catalina.User;

public interface CreateUserUsecase {

    UserDomain execute(UserDomain user);
}
