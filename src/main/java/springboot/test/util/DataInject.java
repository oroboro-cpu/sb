package springboot.test.util;

import java.time.LocalDate;
import java.util.Set;
import javax.annotation.PostConstruct;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import springboot.test.entity.Role;
import springboot.test.entity.User;
import springboot.test.service.RoleService;
import springboot.test.service.UserService;

@Component
@AllArgsConstructor
public class DataInject {
    private final UserService userService;
    private final RoleService roleService;

    @PostConstruct
    public void injectData() {
        Role adminRole = new Role();
        adminRole.setRoleName(Role.RoleName.ADMIN);
        roleService.save(adminRole);
        Role userRole = new Role();
        userRole.setRoleName(Role.RoleName.USER);
        roleService.save(userRole);
        User user = new User();
        user.setName("Bob");
        user.setPassword("qwerty");
        user.setDateOfBirth(LocalDate.of(2000, 10, 20));
        user.setRoles(Set.of(userRole));
        user.setPhoneNumber("+380800300");
        userService.save(user);
    }
}
