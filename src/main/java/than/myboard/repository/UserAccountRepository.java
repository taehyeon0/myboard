package than.myboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import than.myboard.domain.UserAccount;

public interface UserAccountRepository extends JpaRepository<UserAccount, Long> {
}
