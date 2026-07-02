package lest.dev.UserService.service;

import lest.dev.UserService.model.UserComplianceModel;
import lest.dev.UserService.repository.UserComplianceModelRepository;
import org.springframework.stereotype.Service;

@Service
public class UserComplianceService {

    private UserComplianceModelRepository userComplianceModelRepository;

    UserComplianceModel createUserComplianceModel(UserComplianceModel userComplianceModel) {
        return new UserComplianceModel();
    }

    UserComplianceModel findUserComplianceModel(UserComplianceModel userComplianceModel) {
        return new UserComplianceModel();
    }

    UserComplianceModel updateeUserComplianceModel(UserComplianceModel userComplianceModel) {
        return new UserComplianceModel();
    }

    UserComplianceModel deleteUserComplianceModel(UserComplianceModel userComplianceModel) {
        return new UserComplianceModel();
    }

}
