package springboot.test.service;

import springboot.test.entity.User;

public interface UserService {
    User save(User user);

    User findByPhoneNumber(String phoneNumber);

    User getById(Long id);

    void delete(Long id);
}
