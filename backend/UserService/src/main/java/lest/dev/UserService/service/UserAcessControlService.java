package lest.dev.UserService.service;

import lest.dev.UserService.model.UserAcessControlModel;
import lest.dev.UserService.repository.UserAcessControlModelRepository;
import org.springframework.stereotype.Service;

@Service
public class UserAcessControlService {

    private UserAcessControlModelRepository userAcessControlModelRepository;

    UserAcessControlModel createUserAcessControlModel(UserAcessControlModel userAcessControlModel) {
        return new UserAcessControlModel();
    }

    UserAcessControlModel findUserAcessControlModel(UserAcessControlModel userAcessControlModel) {
        return new UserAcessControlModel();
    }

    UserAcessControlModel updateUserAcessControlModel(UserAcessControlModel userAcessControlModel) {
        return new UserAcessControlModel();
    }

    UserAcessControlModel deleteeUserAcessControlModel(UserAcessControlModel userAcessControlModel) {
        return new UserAcessControlModel();
    }

}
