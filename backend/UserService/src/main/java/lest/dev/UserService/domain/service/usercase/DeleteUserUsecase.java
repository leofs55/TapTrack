package lest.dev.UserService.domain.service.usercase;

import lest.dev.UserService.domain.model.entities.UserDomain;

public interface DeleteUserUsecase {

    UserDomain execute(UserDomain user);
}
