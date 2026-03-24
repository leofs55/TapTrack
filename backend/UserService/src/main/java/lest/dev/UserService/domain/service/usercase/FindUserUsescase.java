package lest.dev.UserService.domain.service.usercase;

import lest.dev.UserService.domain.model.entities.UserDomain;

public interface FindUserUsescase {

    UserDomain execute(UserDomain user);
}
