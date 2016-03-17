package am.gitc.service.repository;

import am.gitc.service.model.dto.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Zorik Zaqaryan on 14.03.2016.
 */
@Repository
public interface UserRepository extends PagingAndSortingRepository<User, String> {

    @Override
    User save(User u);

    @Override
    void delete(User u);

    @Query(value = "select count(e) > 0 from User e where e.email = ?1")
    boolean findByEmail(String email);

    @Override
    Page<User> findAll(Pageable var1);

    @Override
    User findOne(String s);

    @Override
    boolean exists(String s);

    @Override
    long count();

    @Override
    void delete(String s);

    List<User> getAllUser();

    void editUser(User user);

    boolean isExistingUser(User user);

    void changeStatus(User user);

}