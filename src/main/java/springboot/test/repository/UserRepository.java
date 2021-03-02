package springboot.test.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import springboot.test.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> getFirstByPhoneNumber(String number);
}
