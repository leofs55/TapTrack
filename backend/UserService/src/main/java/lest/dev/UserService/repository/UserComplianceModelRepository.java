package lest.dev.UserService.repository;

import lest.dev.UserService.model.UserComplianceModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserComplianceModelRepository extends JpaRepository<UserComplianceModel,Integer> {
}
