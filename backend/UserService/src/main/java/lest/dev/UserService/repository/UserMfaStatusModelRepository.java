package lest.dev.UserService.repository;

import lest.dev.UserService.model.UserMfaStatusModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMfaStatusModelRepository extends JpaRepository<UserMfaStatusModel,Long> {
}
