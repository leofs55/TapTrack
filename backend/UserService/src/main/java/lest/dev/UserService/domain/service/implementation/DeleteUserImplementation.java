package lest.dev.UserService.domain.service.implementation;

import lest.dev.UserService.domain.model.entities.UserDomain;
import lest.dev.UserService.domain.service.usercase.DeleteUserUsecase;

public class DeleteUserImplementation implements DeleteUserUsecase {
    @Override
    public UserDomain execute(UserDomain user) {
        return null;
    }
}
