package springboot.test.service;

import org.springframework.stereotype.Service;
import springboot.test.entity.Role;
import springboot.test.repository.RoleRepository;

@Service
public class RoleServiceImpl implements RoleService {
    private final RoleRepository repository;

    public RoleServiceImpl(RoleRepository repository) {
        this.repository = repository;
    }

    @Override
    public Role save(Role role) {
        return repository.save(role);
    }

    @Override
    public Role getByRoleName(String name) {
        return repository.getRoleByRoleName(Role.RoleName.valueOf(name)).get();
    }
}
