package lest.dev.UserService.repository;

import lest.dev.UserService.model.UserAcessControlModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserAcessControlModelRepository extends JpaRepository<UserAcessControlModel, Integer> {
}
