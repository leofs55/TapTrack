package lest.dev.UserService.repository;

import lest.dev.UserService.model.UserFinancialProfileModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserFinancialProfileModelRepository extends JpaRepository<UserFinancialProfileModel,Long> {
}
