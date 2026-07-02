package lest.dev.UserService.service;

import lest.dev.UserService.model.UserFinancialProfileModel;
import lest.dev.UserService.repository.UserFinancialProfileModelRepository;
import org.springframework.stereotype.Service;

@Service
public class UserFinancialProfileService {

    private UserFinancialProfileModelRepository userFinancialProfileModelRepository;

    UserFinancialProfileModel createUserFinancialProfileModel(UserFinancialProfileModel userFinancialProfileModel) {
        return new UserFinancialProfileModel();
    }

    UserFinancialProfileModel findUserFinancialProfileModel(UserFinancialProfileModel userFinancialProfileModel) {
        return new UserFinancialProfileModel();
    }

    UserFinancialProfileModel updateUserFinancialProfileModel(UserFinancialProfileModel userFinancialProfileModel) {
        return new UserFinancialProfileModel();
    }

    UserFinancialProfileModel deleteUserFinancialProfileModel(UserFinancialProfileModel userFinancialProfileModel) {
        return new UserFinancialProfileModel();
    }
}
