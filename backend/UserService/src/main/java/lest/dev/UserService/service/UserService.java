package lest.dev.UserService.service;

import lest.dev.UserService.model.UserModel;
import lest.dev.UserService.repository.UserModelRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserModelRepository userModelRepository;

    UserModel createUserModel(UserModel userModel) {
        return new UserModel();
    }

    UserModel findUserModel(UserModel userModel) {
        return new UserModel();
    }

    UserModel updateUserModel(UserModel userModel) {
        return new UserModel();
    }

    UserModel deleteUserModel(UserModel userModel) {
        return new UserModel();
    }
}
