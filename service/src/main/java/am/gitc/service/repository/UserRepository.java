package am.gitc.service.repository;

import am.gitc.common.model.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Zorik Zaqaryan on 14.03.2016.
 */
@Repository
public interface UserRepository extends PagingAndSortingRepository<User, String> {

    @Override
    User save(User u);

    @Override
    void delete(User u);

//    @Query(value = "SELECT u from User u where u.id = ?1")
//    boolean findByEmail(String email);

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

    User findByEmailAndPassword(String email, String password);

    User findById(Long id);

}