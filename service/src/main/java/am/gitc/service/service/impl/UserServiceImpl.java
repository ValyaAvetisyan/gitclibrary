package am.gitc.service.service.impl;

import am.gitc.common.model.entity.User;
import am.gitc.service.repository.UserRepository;
import am.gitc.service.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Zorik Zaqaryan on 14.03.2016.
 */
public class UserServiceImpl implements IUserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> getAllUser() {
        return null;
    }

    @Override
    public User addUser(User user) {

        return userRepository.save(user);
    }

    @Override
    public User getUserById(Long id) {
        return null;
    }

    @Override
    public User authenticate(String username, String password) {
        return null;
    }
}
