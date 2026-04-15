package lest.dev.UserService.adapter.output.port;

import lest.dev.UserService.adapter.output.persistence.UserRepository;
import lest.dev.UserService.domain.model.entities.UserDomain;
import lest.dev.UserService.domain.port.UserDomainPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserRepositoryPort implements UserDomainPort {

    UserRepository userRepository;

    @Override
    public UserDomain createUser(UserDomain user) {
        return null;
    }

    @Override
    public UserDomain findUser(UserDomain user) {
        return null;
    }

    @Override
    public UserDomain updateUser(UserDomain user) {
        return null;
    }

    @Override
    public UserDomain deleteUser(UserDomain user) {
        return null;
    }
}
