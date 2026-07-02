package lest.dev.UserService.service;

import lest.dev.UserService.model.UserMfaStatusModel;
import lest.dev.UserService.repository.UserMfaStatusModelRepository;
import org.springframework.stereotype.Service;

@Service
public class UserMfaStatusLimitsService {

    private UserMfaStatusModelRepository userMfaStatusModelRepository;

    UserMfaStatusModel createUserMfaStatusModel(UserMfaStatusModel userMfaStatusModel) {
        return new UserMfaStatusModel();
    }

    UserMfaStatusModel findUserMfaStatusModel(UserMfaStatusModel userMfaStatusModel) {
        return new UserMfaStatusModel();
    }

    UserMfaStatusModel updateUserMfaStatusModel(UserMfaStatusModel userMfaStatusModel) {
        return new UserMfaStatusModel();
    }

    UserMfaStatusModel deleteUserMfaStatusModel(UserMfaStatusModel userMfaStatusModel) {
        return new UserMfaStatusModel();
    }

}
