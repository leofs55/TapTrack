package lest.dev.UserService.service;

import lest.dev.UserService.model.UserSpendingLimitsModel;
import lest.dev.UserService.repository.UserSpendingLimitsModelRepository;
import org.springframework.stereotype.Service;

@Service
public class UserSpendingLimitsService {

    private UserSpendingLimitsModelRepository userSpendingLimitsModelRepository;

    UserSpendingLimitsModel createUserSpendingLimitsModel(UserSpendingLimitsModel userSpendingLimitsModel) {
        return new UserSpendingLimitsModel();
    }

    UserSpendingLimitsModel findUserSpendingLimitsModel(UserSpendingLimitsModel userSpendingLimitsModel) {
        return new UserSpendingLimitsModel();
    }

    UserSpendingLimitsModel updateUserSpendingLimitsModel(UserSpendingLimitsModel userSpendingLimitsModel) {
        return new UserSpendingLimitsModel();
    }

    UserSpendingLimitsModel deleteUserSpendingLimitsModel(UserSpendingLimitsModel userSpendingLimitsModel) {
        return new UserSpendingLimitsModel();
    }
}
