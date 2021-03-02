package springboot.test.service;

import springboot.test.entity.Role;

public interface RoleService {
    Role save(Role role);

    Role getByRoleName(String name);
}
