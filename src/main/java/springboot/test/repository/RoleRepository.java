package springboot.test.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import springboot.test.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> getRoleByRoleName(Role.RoleName roleName);
}
