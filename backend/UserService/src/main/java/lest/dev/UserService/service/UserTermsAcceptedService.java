package lest.dev.UserService.service;

import lest.dev.UserService.model.UserSpendingLimitsModel;
import lest.dev.UserService.model.UserTermsAcceptedModel;
import lest.dev.UserService.repository.UserSpendingLimitsModelRepository;
import org.springframework.stereotype.Service;

@Service
public class UserTermsAcceptedService {

    private UserSpendingLimitsModelRepository userSpendingLimitsModelRepository;

    UserTermsAcceptedModel createUserTermsAcceptedModel(UserTermsAcceptedModel userTermsAcceptedModel) {
        return new UserTermsAcceptedModel();
    }

    UserTermsAcceptedModel findUserTermsAcceptedModel(UserTermsAcceptedModel userTermsAcceptedModel) {
        return new UserTermsAcceptedModel();
    }

    UserTermsAcceptedModel updateUserTermsAcceptedModel(UserTermsAcceptedModel userTermsAcceptedModel) {
        return new UserTermsAcceptedModel();
    }

    UserTermsAcceptedModel deleteUserTermsAcceptedModel(UserTermsAcceptedModel userTermsAcceptedModel) {
        return new UserTermsAcceptedModel();
    }
}
