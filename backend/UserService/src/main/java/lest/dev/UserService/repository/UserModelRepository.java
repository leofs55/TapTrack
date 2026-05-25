package lest.dev.UserService.repository;

import lest.dev.UserService.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserModelRepository extends JpaRepository<UserModel,Long> {
}
