package am.gitc.service.service.impl;

import am.gitc.common.model.entity.User;
import am.gitc.service.repository.UserRepository;
import am.gitc.service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Zorik Zaqaryan on 14.03.2016.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
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

    public User getUserByCretentials(String email, String password) {

        return userRepository.findByEmailAndPassword(email, password);

    }
}
