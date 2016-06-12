package am.gitc.service.service;

import am.gitc.common.model.entity.User;

import java.util.List;

/**
 * Created by Zorik Zaqaryan on 14.03.2016.
 */
public interface UserService {
    List<User> findAll();

    User addUser(User user);

    User getUserById(Long id);

    User authenticate(String username, String password);


}
